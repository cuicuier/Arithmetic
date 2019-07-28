package com.cui.leetcode.动态规划;

/**
 * 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。
 *
 * 如果满足以下条件，则称子数组(P, Q)为等差数组：
 *
 * 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。
 *
 * 函数要返回数组 A 中所有为等差数组的子数组个数。
 *
 * 思路：dp[i]表示以A[i]为结尾的数列中等差数列的个数
 *      若A[i]-A[i-1] == A[i-1]-A[i-2]  等差
 *      dp[i]=dp[i-1]+1
 */
public class 等差数列划分 {
    public static int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        int res=0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i]=dp[i-1]+1;
                res+=dp[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};

        System.out.println("等差数列个数为："+numberOfArithmeticSlices(A));
    }
}
