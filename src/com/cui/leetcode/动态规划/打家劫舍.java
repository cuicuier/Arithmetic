package com.cui.leetcode.动态规划;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素
 * 就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *(不能偷相邻的两家)
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 *
 */
public class 打家劫舍 {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        /*int[] robs = new int[nums.length+1];
        robs[0] = 0;
        robs[1] = nums[0];
        for (int i = 2; i <=nums.length; i++) {
            robs[i] = Math.max(robs[i - 1], robs[i - 2] + nums[i-1]);
        }
        return robs[robs.length - 1];*/
        int[] robs = new int[nums.length];
        robs[0] = nums[0];
        robs[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i <nums.length; i++) {
            robs[i] = Math.max(robs[i - 1], robs[i - 2] + nums[i]);
        }
        return robs[robs.length - 1];
    }

    public static void main(String[] args) {
        int[] nums={2,1,1,2};
        System.out.println("能偷窃到的最高金额为："+rob(nums));
    }
}
