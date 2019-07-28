package com.cui.赛码网.基本算法;

import java.util.Scanner;

public class 公交车乘客 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[] outs=new int[n];
        int[] ins=new int[n];

        for (int i=0;i<n;i++){
            outs[i]=in.nextInt();
            ins[i]=in.nextInt();
        }
        System.out.println(getMax(outs,ins));

    }
    public static int getMax(int[] outs,int[] ins){
        int current=0;
        int max=0;
        for (int i=0;i<outs.length;i++){
            current=current-outs[i]+ins[i];
            if (max<current){
                max=current;
            }
        }
        return max;

    }
}
