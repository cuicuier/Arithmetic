package com.cui.往届题练习.今日头条;

import java.util.Scanner;

/**
 * 给定整数m以及n个数字A1, A2, …, An，将数列A中所有元素两两异或，共能得到n(n-1)/2个结果。
 * 请求出这些结果中大于m的有多少个。
 */
public class 异或 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        System.out.println(getMoreMCount(m,arr));
    }
    public static int getMoreMCount(int m,int[] arr){
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=arr.length-1;j>i;j--){
                int out=arr[i]^arr[j];
                if (out>m)
                    count++;
            }
        }
        return count;
    }

}
