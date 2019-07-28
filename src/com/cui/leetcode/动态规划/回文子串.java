package com.cui.leetcode.动态规划;

/**
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 *
 * 思路：dp[i][j]表示子字符串[i,j]是否是回文串
 *      i从s.length()-1开始向前遍历，j也从s.length()-1开始向前遍历，直到j==i
 *      若s[i]==s[j]：
 *      如果i和j相邻或者中间隔一个数，是回文串
 *      如果i和j中间隔大于1个数，判断dp[i+1][j-1]是不是回文串，是则为真
 */
public class 回文子串 {
    public static int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (s.charAt(i) == s.charAt(j)
                        && (j - i <= 2 || dp[i + 1][j - 1] == true)) {
                    dp[i][j] = true;
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(countSubstrings(str));
    }

}
