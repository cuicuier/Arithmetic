package com.cui.数据结构.排序算法;

/**
 * 插入排序
 * 假定前n-1个数已排好，将第n个数插入到前面的有序数列中
 */
public class InsertSort {
    public static int[] sort(int[] a){
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                } else{ //前面的已经排好，不需要再比较
                    break;
                }
            }

        }
       return a;
    }
}
