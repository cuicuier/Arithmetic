package com.cui.剑指offer.字符串;

/**
 * “student. a am I”——> “I am a student.”
 */
public class 翻转字符串 {


    /**
     *
     * 将字符串按空格分隔成字符串数组
     * 从最后一个字符串开始，加入StringBuilder
     */
    public static String reverseStr(String str) {
        String[] strings=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=strings.length-1;i>=0;i--){
            sb.append(strings[i]).append(" ");
        }
        return sb.toString();
    }

}
