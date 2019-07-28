package com.cui.leetcode.动态规划;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 思路：最大连续子数组，curSum初始值为0，每遍历一个数字num，比较curSum + num和num中的较大值存入curSum，
 * 然后再把res和curSum中的较大值存入res，以此类推直到遍历完整个数组，可得到最大子数组的值存在res中。
 * 原理，如果前面的和是负数，那么就没有必要相加，每次元素累加和小于0时，从下一个元素重新开始累加。
 */
public class 最大子序和 {
    public static int maxSubArray(int[] nums) {
        int curSum = 0;
        int res = nums[0];
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);//若curSum为负，最大值为num
            res = Math.max(res, curSum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("最大子序和为：" + maxSubArray(nums));

    }

}
