package com.cui.往届题练习.拼多多;

import java.util.*;

/**
 * 给定一个长度为偶数的数组arr，将该数组中的数字两两配对并求和，在这些和中选出最大和最小值，
 * 请问该如何两两配对，才能让最大值和最小值的差值最小？
 *
 * 输入：一共2行输入。
 * 第一行为一个整数n，2<=n<=10000, 第二行为n个数，组成目标数组，每个数大于等于2，小于等于100。
 * 输出：最小的差值
 *
 * 输入：
 * 4
 * 2 6 4 3
 * 输出：
 * 1
 *
 * 思路：数组排序
 *       使最大值尽可能小，最小值尽可能大
 */
public class 两两配对差值最小 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(arr[i]+arr[n-1-i]);//最左和最右匹配，使最大值尽可能小，最小值尽可能大
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1)-list.get(0));
    }


}
