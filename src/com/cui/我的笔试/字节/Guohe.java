package com.cui.我的笔试.字节;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Guohe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();//n个测试样例
        List<List<Integer>> lists=new ArrayList<>();
        for (int i=0;i<m;i++){
            int n=in.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int j=0;j<n;j++){
                list.add(in.nextInt());
            }
            lists.add(list);

        }


        getTime(lists);

    }
    public static void getTime(List<List<Integer>> lists){
        for (int i=0;i<lists.size();i++){
            List<Integer> list=lists.get(i);
            int minute=getTime2(list);
            System.out.println(minute);
        }


    }
    public static int getTime2(List<Integer> list){
        Collections.sort(list);
        int minute=0;
        if(list.size()==2){
            minute=list.get(list.size()-1);
        }else {
            for (int i=list.size()-1;i>1;i--){
                minute+=list.get(i);
            }
            minute=minute+list.get(1)*(list.size()-3);
        }

        return minute;
    }

}
