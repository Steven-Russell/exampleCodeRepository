package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/18 9:57
 * <p>
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 **/
public class JumpFloor {

//    public int JumpFloor(int target) {
//        if(target==0){
//            return 0;
//        }
//        if(target==1){
//            return 1;
//        }
//        if(target==2){
//            return 2;
//        }
//        return JumpFloor(target-1)+JumpFloor(target-2);
//    }
    public int JumpFloor(int target) {
        if(target == 0) {
            return 0;
        }

        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        //源自大佬的规律总结f(n) = f(n-1) + f(n-2)
        for(int i = 2;i <= target;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[target];
    }
}
