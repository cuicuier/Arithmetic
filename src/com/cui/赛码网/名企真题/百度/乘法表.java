package com.cui.赛码网.名企真题.百度;

import java.util.Scanner;

/**
 * 度度熊和爷爷在玩一个乘法表游戏。乘法表的第i行第j列位置的元素为i*j，并且乘法表下标编号从1开始，比如2 × 3乘法表为
 *
 * 1 2 3
 * 2 4 6
 *
 * 爷爷十分聪明，对于n*m的乘法表，只要度度熊给出一个数k，爷爷就能立刻告诉度度熊乘法表中元素按照不减顺序排列之后，
 * 第k个元素是多少。你能重复这个游戏吗？
 *
 * 输入
 * 输入数据是三个整数：n, m, k (1≤n, m≤5*105, 1≤k≤nm)。\
 * 输出
 * 输出n*m乘法表按照不减顺序排列的第k个数。
 *
 * 二分法的情况下
 * 1.由于该乘法表大小为n*m,因此可以计算出最大值为n*m,而最小值为0，那么mid = (n*m+0)/2。
 * 2.然后根据mid划分出大于mid的集合和小于mid的集合。
 * 3.如果小于mid的集合数量大于k那么就设置最大值为mid-1，并递归查找。
 * 4.如果小于mid的集合数量小于k那么就设置最小值为mid+1，并递归查找。
 * 以上二分法在此题环境下可以轻松判定出小于或大于mid的集合数量，因为乘法表是递增的。
 * 而在一般情况下则需要使用与快速排序相似的方法进行划分。
 */
public class 乘法表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long left=0;
        long right=n*m;
        long mid=right/2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (calSum(mid, m, n) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }

    private static long calSum(long mid, long m, long n) {
        long sum = 0;
        for (long i = 1; i <= m; i++) {
            sum += (mid >= n * i) ? n : mid / i;
        }
        return sum;
    }

}
