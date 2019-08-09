package com.cui.赛码网.名企真题.京东;

import java.util.Scanner;

/**
 * 一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少？她希望你能帮她解决这个问题？
 *
 * 所有的计算均基于十进制进行，结果也用十进制表示为不可约简的分数形式。(求分子分母的最大公约数)
 *
 * 输入
 * 输入中有多组测试数据。每组测试数据为一个整数A（1=＜A=＜5000）。
 * 输出
 * 对每组测试数据，在单独的行中以X/Y的形式输出结果。
 */
public class 进制均值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int A = scanner.nextInt();
            System.out.println(jinzhijunzhi(A));
        }
    }

    private static String jinzhijunzhi(int a) {
        int sum = jinzhihe(a);
        int fenzi = a - 2;//2进制到A-1进制
        int gongyueshu = zuidagongyueshu(sum, fenzi);
        return sum / gongyueshu + "/" + fenzi / gongyueshu;
    }

    /*
    求两个数的最大公约数
     */
    private static int zuidagongyueshu(int a, int b) {
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }

    /*
    求各个进制表示的数位的和
    从数n开始对i取余数，表示i进制最低位；商不为0则继续用商对i取余数，表示次低位.....；直至商为0为止，就得到了n的i进制表示。
     */
    private static int jinzhihe(int a) {
        int sum = 0;
        for (int i = 2; i < a; i++) {//遍历二进制到A-1进制
            int b=a;  //每次都要对a计算，重新赋值，否则a已经变成0
            while (b != 0) {
                sum += b % i;
                b /= i;
            }
        }
        return sum;
    }
}
