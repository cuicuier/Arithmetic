package com.cui.剑指offer.递归和循环;

public class 跳台阶 {

    public static int JumpFloor(int target) {
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        return JumpFloor(target-2)+JumpFloor(target-1);

    }
}
