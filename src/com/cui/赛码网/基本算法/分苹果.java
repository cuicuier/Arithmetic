package com.cui.赛码网.基本算法;


import java.util.Scanner;

/**
 *果园里有堆苹果，N（1＜N＜9）只熊来分。第一只熊把这堆苹果平均分为N份，多了一个，它把多的一个扔了，拿走了一份。
 * 第二只熊把剩下的苹果又平均分成N份，又多了一个，它同样把多的一个扔了，拿走了一份，
 * 第三、第四直到第N只熊都是这么做的，问果园里原来最少有多少个苹果？
 */
public class 分苹果 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=1;
        for (int i=0;i<n;i++){
            sum=sum*n;
        }
        System.out.println(sum-n+1);

    }

}
