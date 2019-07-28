package com.cui.剑指offer.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中
 * 找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class 第一个只出现一次的字符 {


    /**
     * 思路：用Map存储每个字符出现的次数
     * @param str
     */
    public static int getIndexOfOnce(String str) {

        char[] chars=str.toCharArray();
        Map<Character,Integer> count = new HashMap<>();
        for (int i=0;i<chars.length;i++){

            if(!count.containsKey(chars[i])){
                count.put(chars[i],1);
            }else {
                count.put(chars[i],count.get(chars[i])+1);
            }
        }

        for (int i=0;i<chars.length;i++){
            if (count.get(chars[i])==1){
                return i;
            }
        }
        return -1;

    }
}
