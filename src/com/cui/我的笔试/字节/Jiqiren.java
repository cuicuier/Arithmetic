package com.cui.我的笔试.字节;

import java.util.Scanner;

public class Jiqiren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] h=new int[n];
        for (int i =0;i<n;i++){
            h[i]=in.nextInt();
        }
        int e=getE(h);
        System.out.println(e);

    }
    public static int getE(int[] h){
        int e=h[0];
        int i=0;
        int temp=e;
        boolean flag=false;
        while (!flag){
            e=e+(e-h[i]);
            i++;
            if(e<0){
                i=0;
                e=h[0]+1;
                temp=e;

            }

            if(i==(h.length-1) && e>=h[h.length-1]){
                flag=true;
            }
        }
    return temp;
    }
}
