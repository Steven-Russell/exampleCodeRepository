package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/18 22:26
 **/
public class JumpFloorN {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }
//    public int JumpFloorII(int target) {
//        if(target==0){
//            return 0;
//        }
//        if(target==1){
//            return 1;
//        }
//        return 2*JumpFloorII(target-1);
//    }
}
