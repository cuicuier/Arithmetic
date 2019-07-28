package com.cui.我的笔试.字节;

import java.util.Scanner;


public class FindChanpin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){

                arr[i][j]=in.nextInt();
            }
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int minute=getTime(arr);
        System.out.println(minute);
    }
    public static int getTime(int[][] arr){
        int minute=0;
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==2){

                    if((i-1)>=0 && arr[i-1][j]==1){//上
                        arr[i-1][j]=2;
                        flag=true;
                    }
                    if((i+1)<arr.length && arr[i+1][j]==1){//下
                        arr[i+1][j]=2;
                        flag=true;
                    }
                    if((j-1)>=0 && arr[i][j-1]==1){//左
                        arr[i][j-1]=2;
                        flag=true;
                    }
                    if((j+1)<arr[i].length && arr[i][j+1]==1){//右
                        arr[i][j+1]=2;
                        flag=true;
                    }
                    if(flag==true){
                        minute++;
                    }

                }

            }

        }
        if (minute==0){
            minute=-1;
        }
        return minute;
    }
}
