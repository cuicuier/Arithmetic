package com.cui.leetcode.动态规划;

/**
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 * 思路：先计算出所有区域和，用sum数组存储
 *      再计算[i,j]的区间和=[0,j]-[0,i-1]
 *      为了防止下标越界，sum的下标比nums的下标加1
  */
public class 区域和检索 {
    private static int[] sum;
    public 区域和检索(int[] nums) {
        sum = new int[nums.length+1];
        sum[0]=0;
        for (int i = 1; i <=nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {

        return sum[j+1]-sum[i];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        区域和检索 obj = new 区域和检索(nums);

        System.out.println("区域和为："+obj.sumRange(0,5));
    }
}
