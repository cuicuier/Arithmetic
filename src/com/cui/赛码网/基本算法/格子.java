package com.cui.赛码网.基本算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 格子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++) { //格子数
            list.add(sc.nextInt());

        }
        int[] out=new int[m];
        for (int j=0;j<m;j++){ //操作次数
            int caozuo=sc.nextInt();
            int start=sc.nextInt();
            int end=sc.nextInt();
            out[j] = gezi(list,caozuo,start, end);
        }
        for(int i=0;i<m;i++){
            if(out[i]!=0){
                System.out.println(out[i]);
            }
        }
    }
    public static int gezi(List<Integer> gezi,int caozuo,int start,int end){
        int out=0;
        switch (caozuo) {
            case 1: {
                break;
            }
            case 2: {
                int sum = 0;
                for (int i = start - 1; i < end ; i++) {
                    sum += gezi.get(i);
                }
                out = sum;
                break;
            }
            case 3: {
                List<Integer> sTe = new ArrayList<Integer>();
                for (int i = start - 1; i < end; i++) {
                    sTe.add(gezi.get(i));

                }
                Collections.sort(sTe);
                out = sTe.get(sTe.size() - 1);
                break;

            }
        }
        return out;
   }
}
