package com.cui.赛码网.基本算法;

import java.util.*;

public class Ludeng {

    /**
     *题目描述
     *
     * V先生有一天工作到很晚，回家的时候要穿过一条长l的笔直的街道，这条街道上有n个路灯。
     * 假设这条街起点为0，终点为l，第i个路灯坐标为ai。路灯发光能力以正数d来衡量，其中d表
     * 示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。为了让V先生看清
     * 回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
     *
     * 输入
     * 输入两行数据，第一行是两个整数：路灯数目n (1≤n≤1000)，街道长度l (1 ≤l≤109)。
     * 第二行有n个整数ai (0 ≤ ai≤ l)，表示路灯坐标，多个路灯可以在同一个点，也可以安放在终点位置。
     *
     * 输入
     * 输入两行数据，第一行是两个整数：路灯数目n (1≤n≤1000)，街道长度l (1 ≤l≤109)。第二行有n个
     * 整数ai (0 ≤ ai≤ l)，表示路灯坐标，多个路灯可以在同一个点，也可以安放在终点位置。
     */
    public static void main(String[] args) {
        //路灯数目n，街道长度l
        //n个路灯的坐标ai
        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入n、l、ai");
        int n=sc.nextInt();
        int l=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        double d=getD(l,arr);
        System.out.println(String.format("%.2f",d));


    }
    public static double getD(int l,int[] arr){

        Arrays.sort(arr);
        double maxD=Double.MIN_VALUE;//记录两路灯之间的距离最大值
        for(int i=1;i<arr.length;i++){
            if(maxD<(double) (arr[i]-arr[i-1])/2){
                maxD=(double)(arr[i]-arr[i-1])/2;
            }

        }
        if(arr[0]!=0){//表示0位置没有路灯
            if(maxD<arr[0])
                maxD=arr[0];
        }
        if(arr[arr.length-1]!=l){//表示l位置没有路灯
            int ld=l-arr[arr.length-1];//最后一个路灯到路尽头的距离
            if(maxD<ld)
                maxD=ld;
        }


        return maxD;
    }

//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int len = sc.nextInt();
//        int[] spot = new int[n];
//        for(int i=0;i<n;i++)
//            spot[i] = sc.nextInt();
//        Arrays.sort(spot);
//        double maxdistance = Double.MIN_VALUE;
//        for(int i=1;i<n;i++){
//            if(spot[i]-spot[i-1]>maxdistance)
//                maxdistance = spot[i]-spot[i-1];
//        }
//        double left = spot[0];
//        double right = len - spot[n-1];
//        if(left>right&&left>maxdistance/2){
//            System.out.printf("%.2f",left);
//        }
//        else if(right>=left&&right>maxdistance/2){
//            System.out.printf("%.2f",right);
//        }
//        else{
//            System.out.printf("%.2f",maxdistance/2);
//        }
//    }
}



