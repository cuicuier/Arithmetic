package com.cui.赛码网.名企真题.百度;

import java.util.Scanner;

/**
 * 表格单元所在的行则是按数值从1开始编号的，表格单元名称则是其列编号和行编号的组合，如单元格BB22代表的单元格为54列中第22行的单元格。
 * 小B感兴趣的是，编号系统有时也可以采用RxCy的规则，其中x和y为数值，表示单元格位于第x行的有第y列。上述例子中的单元格采用这种编码体系时的名称为R22C54。
 *
 *输入
 * 输入的第一行为一个正整数T，表示有T组测试数据（1<=T<=10^5）。随后的T行中，每行为一组测试数据，为一种形式表示的单元格坐标。
 * 保证所有的坐标都是正确的，且所有行列坐标值均不超过10^6。
 * 输出
 * 对每组测试数据，单独输出一行，为单元格坐标的另一种表示形式。
 */
public class 编号转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  //nextInt() 不会跳过"\n"
        scanner.nextLine(); //跳过换行符"\n"
        String[] strings = new String[T];
        for (int i = 0; i < T ; i++) {
            strings[i] = scanner.nextLine();
        }
        for (String str:strings
             ) {
            System.out.println(bianhao(str));
        }
    }

    private static String bianhao(String str) {
        if (str.matches("R\\d+C\\d+")) {
            return changeToBsc(str);
        }
        return changeToRC(str);
    }

    private static String changeToBsc(String str) {
        int col=0,row=0;
        boolean isRow = true;
        for(char c : str.toCharArray()) {
            if( c <= '9') {
                if( isRow )
                    row = row * 10 + c - '0';
                else
                    col = col * 10 + c - '0';
            } else {
                isRow = c == 'R';
            }
        }
        String col_s = "";
        while( col > 0) {
            int t = (col-1) % 26 + 1;
            col_s = (char)(t + 'A' -1) + col_s;
            col = (col-1) / 26;
        }
        return col_s+row;
    }
    private static String changeToRC(String str) { // BC23
        int col=0,row=0;
        for(char c : str.toCharArray()) {  //遍历字符串的每一个字符
            if( c>= 'A') {
                col = col * 26 + c - 'A' + 1;
            } else {
                row = row * 10 + c - '0';
            }
        }
        return "R"+row+"C"+col;
    }
}
