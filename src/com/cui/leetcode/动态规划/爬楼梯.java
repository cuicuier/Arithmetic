package com.cui.leetcode.动态规划;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 思路：爬第i阶有两种可能
 *      第一种：从第i-1阶爬一阶到达
 *      第二种：从第i-2阶爬二阶到达
 */
public class 爬楼梯 {
    public static int climbStairs(int n) {
        /*
        递归
         */
        /*if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);*/

        /*
        动态规划
         */
        int a=1,b=2;
        int res=0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        for (int i = 3; i <= n; i++) {
            res = a + b;
            a=b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("爬n阶楼梯的方法数为："+climbStairs(3));
    }
}
