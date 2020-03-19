package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/19 21:59
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 **/
public class Multiply {
    public int[] multiply(int[] A) {
        int[] a = new int[A.length];//保存0到k-1的值
        int[] b = new int[A.length];//保存k+1到A.length-1的值

        int ans = 1;

        for (int i = 0; i < A.length; i++) {
            a[i] = ans;
            ans *= A[i];
        }
        ans = 1;
        for(int i = A.length-1;i>=0;i--){
            b[i] = ans;
            ans *= A[i];
        }
        int[] res = new int[A.length];
        for(int i =0;i<A.length;i++){
            res[i]=a[i]*b[i];
        }
        return  res;
    }


    public static void main(String[] args) {
        int[] c = {1,2,3,4,5};
        new Multiply().multiply(c);
    }
}
