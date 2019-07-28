package com.cui.数据结构.排序算法;

/**
 * 选择排序
 * 第一次遍历n-1个数，找到最小的数与第一个元素交换位置
 * 第二次遍历n-2个数，找到最小的数与第二个元素交换位置
 * 重复
 */
public class SelectSort {
    public static int[] sort(int[] a){
        for (int i=0;i<a.length-1;i++){
            int mix=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[mix]){
                    mix=j;
                }
            }
            if (mix!=i){
                int temp=a[i];
                a[i]=a[mix];
                a[mix]=temp;
            }
        }
        return a;
    }
}
