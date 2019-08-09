package com.cui.赛码网.基本算法;

import java.util.Scanner;

/**
 * 某校计算机专业今年录取研究生的要求是：政治、英语每门课成绩不低于60分，数学和专业课不低于90分，
 * 总成绩不低于310分。并且规定：在满足单科以及总成绩最低要求的基础上，
 * 350分以上（含350分）为公费（Gongfei），310分~349分为自费(Zifei)。
 *
 * 请编程判断考生的录取情况。
 *
 * 输入
 * 输入数据首先包括一个正整数N，表示有N组测试数据。
 * 每组数据包含4个正整数，分别表示考生的四门课成绩（顺序为：政治、英语、数学、专业课），你可以假设所有的分数数据都合法。
 * 输出
 * 请输出每组数据对应考生的录取情况（Fail/Zifei/Gongfei）。
 */
public class 研究生考试 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            int score3 = scanner.nextInt();
            int score4 = scanner.nextInt();
            System.out.println(luquqingkuang(score1,score2,score3,score4));
        }
    }

    private static String luquqingkuang(int score1, int score2, int score3, int score4) {
        String qingkuang = "";
        int sum = score1 + score2 + score3 + score4;
        if (score1 < 60 || score2 < 60
                || score3 < 90 || score4 < 90 || sum < 310) {
            qingkuang = "Fail";
            return qingkuang;
        }

        if (sum >= 350) {
            qingkuang = "Gongfei";
        } else {
            qingkuang = "Zifei";
        }
        return qingkuang;

    }
}
