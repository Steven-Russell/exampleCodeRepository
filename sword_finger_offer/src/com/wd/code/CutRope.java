package com.wd.code;

import java.util.Scanner;

/**
 * @author StevenRussell
 * @date 2020/3/10 14:07
 * <p>
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 输入一个数n，意义见题面。（2 <= n <= 60）
 **/
public class CutRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //接收绳子长度
            int n = scanner.nextInt();
            System.out.println(cutRopeDynamic(n));
        }
    }

    //进行绳子切割
    public static int cutRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        //最大值
        int max = 0;
        //尽可能分割出3
        if (n % 3 == 0) {
            max = (int) Math.pow(3, n / 3);
        }
        //当余1的时候说明最后可以有1+3 = 4最好分割为2+2这样才能够产生最大值
        if (n % 3 == 1) {
            max = (int) (4*Math.pow(3,n/3-1));
        }
        if (n % 3 == 2) {
            max = (int) (2*Math.pow(3,n/3));
        }
        return max;
    }

    //动态规划解法
    public static int cutRopeDynamic(int n){
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        //创建dp
        int[] dp = new int[n+1];
        //执行初始化
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4;i<=n;i++){
            for(int j =0;j<=n/2;j++){
                dp[i] = Math.max(dp[i],dp[i-j]*dp[j]);
            }
        }
        return dp[n];
    }
}
