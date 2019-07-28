package com.cui.leetcode.动态规划;

/**
 * 给定一个非负整数 n（n表示位数），计算各位数字都不同的数字 x 的个数
 *
 * 思路：1位数，有10个
 *       2位数，第一位有9种情况（不能是0），第二位有9种情况（除去第一位） 9*9
 *       3位数，在2位数的基础上，第三位有8种情况（除去前两位）  9*9*8  再加上2位数和1位数的情况
 */
public class 计算各个位数不同的数字个数 {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 1) {
            return 10;
        }
        if (n == 0) {
            return 1;
        }
        int res=9;
        int result=10;
        for (int i = 2; i <=n; i++) {
            res *= (10 - i + 1);
            result += res;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("各位数字都不同的数的个数为："+countNumbersWithUniqueDigits(2));
    }
}
