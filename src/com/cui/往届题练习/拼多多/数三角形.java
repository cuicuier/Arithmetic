package com.cui.往届题练习.拼多多;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给出平面上的n个点，现在需要你求出，在这n个点里选3个点能构成一个三角形的方案有几种。
 * 输入：
 * 第一行包含一个正整数n，表示平面上有n个点（n <= 100)
 * 第2行到第n + 1行，每行有两个整数，表示这个点的x坐标和y坐标。(所有坐标的绝对值小于等于100，且保证所有坐标不同）
 * 输出：
 * 输出一个数，表示能构成三角形的方案数。
 *
 * 思路：判断三个点是否共线，不共线则构成三角形
 */
public class 数三角形 {
    public static void main(String[] args) {
        class Point{
            int x;
            int y;

            Point(int xx, int yy) {
                x = xx;
                y = yy;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pointList.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }
        int count = 0; //记录三角形个数
        for (int i = 0; i < pointList.size(); i++) {
            for (int j = i+1; j < pointList.size(); j++) {
                for (int k = j+1; k <pointList.size() ; k++) {
                    //判断三个点是否在一条直线上
                    //斜率相同且共点（斜率公式换成对角线相乘）
                    if ((pointList.get(i).x-pointList.get(j).x)*(pointList.get(j).y-pointList.get(k).y)
                            == (pointList.get(j).x-pointList.get(k).x)*(pointList.get(i).y-pointList.get(j).y)
                    ){
                        continue;
                    } else {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
