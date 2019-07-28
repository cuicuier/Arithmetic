package com.cui.剑指offer.字符串;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class 把字符串转换为整数 {

    /**
     * 思路：字符'0'对应48，'9'对应57
     */
    public static int Strtoint (String str) {
        boolean flag = false; //标志字符串的第一位是否是否为负号-
        int start=0;
        int number=0;
        if (str.charAt(0)=='-'){//第一位为负号
            flag=true;
            start=1;

        }
        for (int i=start;i<str.length();i++){
            if (str.charAt(i)=='+'){
                continue;
            }
            if(str.charAt(i)<48 || str.charAt(i)>57){//字符串中有0到9以外的字符，直接返回0
                return 0;
            }
            number=number*10+str.charAt(i)-48;
        }
        return flag==true? -number:number;
    }
}
