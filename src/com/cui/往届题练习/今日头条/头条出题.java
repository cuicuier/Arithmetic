package com.cui.往届题练习.今日头条;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 每套3道题 a,b,c表示难度系数
 * a＜= b＜= c
 * b - a＜= 10
 * c - b＜= 10
 * 现在已有n道题，每题必须使用且只能用一次
 * 求至少需要再出几道题
 *
 * 输入：题目数，各题的难度系数
 */
public class 头条出题 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        int insert=0;
        for (int i=0;i<i+3 && i<list.size()-1;i++){
            if (list.get(i+1)-list.get(i) >10){
                list.add(i+1,list.get(i)+10);
                insert++;
                i+=2;
            }
        }
        insert+=3-list.size()%3;
        System.out.println(insert);
    }



}
