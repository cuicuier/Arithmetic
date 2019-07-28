package com.cui.我的笔试.拼多多;

import java.util.Scanner;

/**
 * 某国有K种方言，N人
 * 第i种方言有Xi人会说
 * 求K种方言都会的人至少有多少（至少很关键）
 *
 * 例子：该国有10个人，3种语言
 *      8个人会a语言
 *      7个人会b语言——(10-7)=3个人不会b语言——（8-3）=5个人会a语言和b语言
 *      6个人会c语言——(10-6)=4个人不会c语言——(5-4)=1个人会a,b,c三种语言
 */
public class 方言 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//人数
        int k = sc.nextInt();//语言种数
        int res = n;
        for (int i = 0; i < k; i++){
            int tmp = sc.nextInt();
            tmp = n - tmp;
            res = res - tmp;

        }
        if (res < 0)
            res = 0;
        System.out.println(res);

    }



}
