package com.cui.赛码网.名企真题.京东;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 输入
 * 多组（不超过 5 组）数据。
 * 每组输入数据分为三行，第一行有两个数字 n,m($0＜n,m\leq10000$)，分别表示集合 A 和集合 B 的元素个数。后两行分别表示集合 A 和集合 B。
 * 每个元素为不超出 int 范围的整数，每个元素之间有一个空格隔开。
 *
 * 输出
 * 针对每组数据输出一行数据，表示合并后的集合，要求从小到大输出，每个元素之间有一个空格隔开。
 */
public class 集合 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int[] A = new int[a];
            int b = scanner.nextInt();
            int[] B = new int[b];

            for (int i = 0; i < a; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < b; i++) {
                B[i] = scanner.nextInt();
            }

            bingji(A, B);
        }

    }

    private static void bingji(int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();
        for (Integer a:A
             ) {
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        for (Integer b:B
             ) {
            if (!list.contains(b)) {
                list.add(b);
            }
        }
        Collections.sort(list);
        for (Integer l:list
             ) {
            System.out.print(l+" ");
        }
    }
}
