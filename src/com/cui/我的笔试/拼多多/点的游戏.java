package com.cui.我的笔试.拼多多;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个字符串，每个字符代表一种颜色的球，擦除两个相邻的相同颜色的球
 * 求可擦除的次数
 */
public class 点的游戏 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(getOT(str));
    }
    public static int getOT(String str){
        List<Character> list = new ArrayList<Character>();
        for (int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        int count=0;
        int start=0;
        while (start<list.size()-1){
            if(list.get(start)==list.get(start+1)){
                list.remove(start);
                list.remove(start);
                start=0;
                count++;
            }else {
                start++;
            }
        }
        return count;

    }


}
