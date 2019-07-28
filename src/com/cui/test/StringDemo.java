package com.cui.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
//        String s = new String("abc");
//        String s1 = "abc";
//        String s2 = new String("abc");
//        System.out.println(s == s1.intern());
//        System.out.println(s == s2.intern());
//        System.out.println(s1 == s2.intern());
//        String str2 = new String("str")+new String("01");
//        str2.intern();
//        String str1 = "str01";
//        System.out.println(str2==str1);
        String str2 = new String("str")+new String("01");
        String str1 = "str01";
        str2.intern();
        System.out.println(str2==str1);

        int a=100;
        int b=50;
        int c=a---b;
        System.out.println(a);
        int d=a---b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);


        Pattern pattern=Pattern.compile("([a-z])\\1");
        Matcher matcher = pattern.matcher("abcdd");
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
        int aaa=016;
        System.out.println(aaa);



    }
}
