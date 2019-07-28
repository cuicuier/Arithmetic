package com.cui.leetcode.动态规划;

/**
 * 输入：一个数组，所有元素非负，每个元素表示爬上该台阶的体力花费值，然后可以继续爬一个台阶或两个台阶。
 *      可以选择索引0或索引1的元素作为初始阶梯
 * 输出：到达楼层顶部的最低花费
 * 思路：到达第i个阶梯的最小花费cost[i]与cost[i-1]、cost[i-2]有关
 * 状态转移方程：cost[i]=stairs[i]+min(cost[i-1]，cost[i-2])
 * cost[i]表示以第i个元素结尾的最小值
 */
public class 使用最小花费爬楼梯 {
    public static int minCostClimbingStairs(int[] stairs) {
        int[] cost=new int[stairs.length];
        cost[0] = stairs[0];
        cost[1] = stairs[1];
        for (int i = 2; i <stairs.length; i++) {
            cost[i] = stairs[i] + Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[stairs.length-1],cost[stairs.length-2]);

    }

    public static void main(String[] args) {
        int[] stairs = {10, 15, 20};
        int[] stairs2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(stairs2));
    }
}
