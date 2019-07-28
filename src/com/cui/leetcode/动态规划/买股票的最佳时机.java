package com.cui.leetcode.动态规划;

import java.lang.Math;

public class 买股票的最佳时机 {
    public static int maxProfit(int[] prices) {
        int res = 0,buy = Integer.MAX_VALUE;
        for (int price : prices) {
            buy = Math.min(buy,price);
            res = Math.max(res,price - buy);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }

}
