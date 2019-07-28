package com.cui.我的笔试.字节;

import java.util.Scanner;

public class Chepei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int f=getF(arr);
        System.out.println(f);

    }
    public static int getF(int[][] arr){
        int sum=0;

        int length=arr.length;
        for(int i=0;i<arr.length;i++){
            int min=0;
            for(int j=i+1;j<arr.length-1;j++){

                if(arr[i][j]<arr[i][j+1]){
                    min=arr[i][j];
                }

            }
            sum+=min;
        }
        for(int i=length-1;i>0;i--){
            int min=0;
            for(int j=i-2;j>=0;j--){
                if(arr[i][j]>arr[i][j+1]){
                    min=arr[i][j+1];
                }
                sum+=min;
            }
        }
        return sum;
    }
}
