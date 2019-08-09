package com.cui.往届题练习.拼多多;

import java.util.Scanner;

/**
 * 有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
 */
public class 大整数相乘 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String  res;
        if (str1 == null || str2 == null) {
            res=null;
        }
        if (str1.charAt(0)=='0'||str2.charAt(0)=='0') {
            res=""+'0';
        }
        res= multiply(str1,str2);
        System.out.println(res);
    }

    private static String  multiply(String str1, String str2) {
        //1.将字符串反转
        String num1=new StringBuffer(str1).reverse().toString();
        String num2=new StringBuffer(str2).reverse().toString();
        int n1Length=num1.length();
        int n2Length=num2.length();
        //2.建立一个数组保存结果，该结果最长为n1Length+n2Length
        int [] arr=new int [n1Length+n2Length];
        for(int i=0;i<n1Length;i++) {
            for(int j=0;j<n2Length;j++) {
                arr[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        StringBuffer sBuffer=new StringBuffer();
        for(int i=0;i<arr.length;i++) {
            int curBit=arr[i]%10;
            int postCur=arr[i]/10;
            if (i+1<arr.length) {
                arr[i+1]+=postCur;
            }
            sBuffer.insert(i, curBit);
        }
        if (sBuffer.reverse().charAt(0)=='0') {
            sBuffer.deleteCharAt(0);
        }
        return sBuffer.toString();
    }

}
