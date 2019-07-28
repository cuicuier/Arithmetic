package com.cui.往届题练习.今日头条;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 给定整数n和m，将1到n的这n个整数按字典序排列之后，求其中的第m个数字。
 *
 * 对于n = 11，m = 4，按字典序排列依次为1, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9，因此第4个数字为2。
 */
public class 字典序 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        if (n<10){
            System.out.println(m);
            return;
        }
        ArrayList<String> list=new ArrayList<String>();
        for (int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        System.out.println(list.get((int) m-1));
    }


}
