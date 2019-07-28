package com.cui.我的笔试.on360;

import java.util.Scanner;

public class 字符串转换成整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(string2int(str));
    }

    public static int string2int(String str) {
        if (str.length()==0){
            return 0;
        }
        boolean flag=false;//标志第一位是否为负号
        int start=0; //开始扫描的位置
        int number=0;
        if (str.charAt(0)=='-'){
            flag=true;
            start=1; //字符串第一位为负号，数值从第二位开始扫描
        }else if (str.charAt(0)=='+'){
            start=1;
        }
        for (int i=start;i<str.length();i++){
            if (str.charAt(i)=='.'){
                break;
            }
            if (str.charAt(i)<48 || str.charAt(i)>57){
                return 0;
            }
            number=number*10+str.charAt(i)-48;

        }
        return flag==true? -number:number;

    }
}
