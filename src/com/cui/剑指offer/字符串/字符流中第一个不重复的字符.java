package com.cui.剑指offer.字符串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，
 * 第一个只出现一次的字符是"l"。如果当前字符流没有存在出现一次的字符，返回#字符
 */
public class 字符流中第一个不重复的字符 {


    /**
     * 思路：Map无序，要找到第一个出现一次的字符，将字符存入list（有序）
     * @param str
     * @return
     */
    public static char getOnceChar(String str) {
        char[] chars=str.toCharArray();
        Map<Character,Integer> count = new HashMap<>();//Map是无序的
        List<Character> list=new ArrayList<>();//List有序
        for (int i=0;i<chars.length;i++){

            if(!count.containsKey(chars[i])){
                count.put(chars[i],1);
                list.add(chars[i]);
            }else {
                count.put(chars[i],count.get(chars[i])+1);
            }
        }

        for (char c:list
             ) {
            if (count.get(c)==1){
                return c;
            }
        }
        return '#';

    }
}
