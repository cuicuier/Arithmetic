package com.cui.剑指offer.字符串;

import static com.cui.剑指offer.字符串.字符流中第一个不重复的字符.getOnceChar;
import static com.cui.剑指offer.字符串.左旋转字符串.LeftRotateString;
import static com.cui.剑指offer.字符串.把字符串转换为整数.Strtoint;
import static com.cui.剑指offer.字符串.第一个只出现一次的字符.getIndexOfOnce;
import static com.cui.剑指offer.字符串.翻转字符串.reverseStr;
import static com.cui.剑指offer.字符串.表示数值的字符串.isNumeric;
import static com.cui.剑指offer.字符串.表示数值的字符串.isNumeric2;

public class Main {
    public static void main(String[] args) {
        char[] str={'1','2','e','.','2'};
        char[] str2={'+','1','.','1','e','7'};
        char[] str3={'e','1'};
        char[] str4={'1','e','0'};
        System.out.println(isNumeric(str3));
        System.out.println(isNumeric2(str3));

        String string = "I have an apple.";
        System.out.println(getIndexOfOnce(string));
        System.out.println(getOnceChar(string));
        System.out.println(reverseStr(string));

        String string2="abcXYZdef";
        System.out.println(LeftRotateString(string2,10));

        System.out.println(Strtoint("0"));


    }



}
