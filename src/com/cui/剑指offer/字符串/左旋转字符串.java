package com.cui.剑指offer.字符串;

/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
 */
public class 左旋转字符串 {

    /**
     * 思路：左移K位，前K位补到字符串末尾
     */

    public static String LeftRotateString(String str,int k) {
        int length=str.length();
        k%=length;
        String left=str.substring(k);
        String right=str.substring(0,k);
        return left+right;


    }
}
