package com.cui.leetcode.动态规划;

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 思路：将i拆分成两个数的和或者多个数的和
 *      dp[i]表示整数i被拆分后的最大乘积
 *      两个数的和，乘积为 j*（i-j）
 *      多个数的和，乘积为 dp[j]*(i-j)
 */
public class 整数拆分 {
    public static int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        int t;
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j < i; j++) {  //拆分i
                t=Math.max(j*(i-j),dp[j]*(i-j));
                dp[i] = Math.max(dp[i], t);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("整数拆分："+integerBreak(5));
    }
}
