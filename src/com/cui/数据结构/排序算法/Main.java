package com.cui.数据结构.排序算法;

public class Main {
    public static void main(String []args){

        int[] a = {66,13,51,76,81,26,57,69,23};
        int start = 0;
        int end = a.length-1;


//        System.out.println("冒泡排序：");
//        int[] out=BubbleSort.sort(a);

//        System.out.println("插入排序：");
//        int[] out=InsertSort.sort(a);

//        System.out.println("选择排序：");
//        int[] out=SelectSort.sort(a);

//        System.out.println("快速排序：");
//        int[] out=FastSort.sort(a,start,end);


        System.out.println("归并排序：");
        int[] out=MergeSort.sort(a,start,end);

        for(int i = 0; i<out.length; i++){
            System.out.print(out[i]+" ");
        }




    }
}
