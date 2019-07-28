package com.cui.剑指offer.字符串;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 规则：小数点.和E或e只能出现一次
 *       E或e后面必须是整数
 *       E或e前面必须有数字
 *
 */
public class 表示数值的字符串 {
    /**
     * 正则表达式匹配
     */
    public static boolean isNumeric(char[] str) {
        String res = String.valueOf(str);
        /*
        [+-]? 表示+或-出现0次或1次
        [0-9]{0,} 表示0到9的数出现0次或多次
        (\.?[0-9]{1,})?  小数点.出现0次或1次，0到9出现1次或多次。 整个分组出现0次或1次
        ([Ee][+-]?[0-9]{1,})?
         */
        return res.matches("[+-]?[0-9]{1,}(\\.?[0-9]{1,})?([Ee][+-]?[0-9]{1,})?");
    }

    /**
     * 思路:按照一定的规则，如果第一位是+或-，就后移一位。
     * 如果是数字，索引后移，数字表示1.
     * 如果是点，要判断至此点的数量和e的数量是否已经有了，因为java 中e要求后面为整数，如果有了肯定false。索引后移，dotnum增加。
     * 如果是e，判断是否重复e，或者前面没有数字返回false。enum++， 索引++，此时还要判断最后一位是不是e或者+或者-，如果是false。
     */
    public  static boolean isNumeric2(char[] str) {
        if(str == null)
            return false;
        int length = str.length;
        int dotNum = 0;//记录点的数量
        int index = 0;//索引
        int eNum = 0;//记录e的数量
        int num = 0;//记录数字的数量
        if (str[0] == '+' || str[0] == '-') {
            index++;
        }
        while (index < length) {
            if(str[index]>='0' && str[index]<='9') {
                index++;
                num = 1;
                // .前面可以没有数字,所以不需要判断num是否为0
            }else if(str[index]=='.') {
                // e后面不能有.,e的个数不能大于1.java科学计数要求aeb，b为整数
                if(dotNum >0 || eNum >0)
                    return false;
                dotNum++;
                index++;
            }else if(str[index] == 'e' || str[index] == 'E') {
                // 重复e或者e前面没有数字
                if(eNum > 0 || num ==0)
                    return false;
                eNum++;
                index++;
                // 符号不能在最后一位
                if(index < length &&(str[index]=='+'||str[index]=='-'))
                    index++;
                // 表示e或者符号在最后一位
                if(index == length)
                    return false;
            }else {
                return false;
            }

        }
        return true;
    }

}
