package com.cui.赛码网.基本算法;

import java.util.Scanner;

/**
 * 输入文件的第一行有两个整数M（1 <= M <= 10000）和 N（1 <= N <= 100），
 * M代表马路的长度，N代表区域的数目，M和N之间用一个空格隔开。
 * 接下来的N行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。
 * 所有输入都为整数。且M和N的范围为上面提示范围。
 * 每个整数点上有一个路灯
 *
 * 求修建区域后（移除路灯），马路上剩余的路灯数目
 */
public class 马路上的路灯 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr=new int[n][2];
        for (int i=0;i<n;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }

        int count=m+1;
        int del=arr[0][1]-arr[0][0]+1;
        for (int i=0;i<n-1;i++){
            if (arr[i+1][0]>arr[i][0] && arr[i+1][0]<arr[i][1] && arr[i+1][1]>arr[i][1] ){
                del+=arr[i+1][1]-arr[i][1];
            }else if (arr[i+1][0]>arr[i][1]){
                del+=arr[i+1][1]-arr[i+1][0]+1;
            }

        }
        System.out.println(count-del);

    }


}
