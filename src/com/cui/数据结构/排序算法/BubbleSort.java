package com.cui.数据结构.排序算法;

/**
 * 冒泡排序
 * 从后往前，两两比较，把较小的数放在前面，直到最小的数放在起始位置
 * 重复上述过程，依次将第2,3，。。。，n-1个最小数排好位置
 */
public class BubbleSort {
    public static int[] sort(int[] a){
        for (int i=0;i<a.length-1;i++){//表示第i趟
            boolean flag=false;
            for (int j=a.length-1;j>i;j--){
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    flag=true;
                }
            }
            if (!flag){//当一轮比较结束后flag仍为false，说明后面的数据顺序已经排好
                break;
            }

        }
        return a;
    }
}
