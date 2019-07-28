package com.cui.往届题练习.拼多多;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，对于每个小朋友i，
 * 当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，他才会上去表演节目。
 * 老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
 */
public class 六一儿童节分巧克力 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//n表示h数组元素个数（孩子数）
        int[] h=new int[n];
        for (int i=0;i<n;i++){
            h[i]=in.nextInt();
        }
        int m=in.nextInt();//m表示w数组元素个数（巧克力数）
        int[] w=new int[m];
        for (int i=0;i<m;i++){
            w[i]=in.nextInt();
        }
        System.out.println(getStuNum(h,w));

    }
    public static int getStuNum(int[] h,int[] w){
        Arrays.sort(h);
        Arrays.sort(w);
        int stuNum=0;
        int i=h.length-1; //i表示学生需要巧克力的指针
        int j=w.length-1;//j表示巧克力重量的指针
        while (i>=0 && j>=0){  //从后向前扫描
            if (w[j]>=h[i]){
                stuNum++;
                i--;
                j--;
            }else {
                i--;
            }
        }
        return stuNum;
    }


}
