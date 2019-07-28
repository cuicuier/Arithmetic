package com.cui.往届题练习.拼多多;

import java.util.*;

/**
 * 有n只小熊，他们有着各不相同的战斗力。每次他们吃糖时，会按照战斗力来排，战斗力高的小熊拥有优先选择权。
 * 前面的小熊吃饱了，后面的小熊才能吃。每只小熊有一个饥饿值，每次进食的时候，小熊们会选择最大的能填饱自己
 * 当前饥饿值的那颗糖来吃，可能吃完没饱会重复上述过程，但不会选择吃撑。
 * 现在给出n只小熊的战斗力和饥饿值，并且给出m颗糖能填饱的饥饿值。
 * 求所有小熊进食完之后，每只小熊剩余的饥饿值。
 *
 * 输入：
 * 第一行两个正整数n和m，分别表示小熊数量和糖的数量。（n <= 10, m <= 100）
 * 第二行m个正整数，每个表示着颗糖能填充的饥饿值。
 * 接下来的n行，每行2个正整数，分别代表每只小熊的战斗力和当前饥饿值。
 * 题目中所有输入的数值小于等于100。
 * 输出：
 * 输出n行，每行一个整数，代表每只小熊剩余的饥饿值。
 */
public class 小熊吃糖 {
    public static void main(String[] args) {
        class Bear { //内部类
            int power;
            int hunger;

            Bear(int p, int h) {
                power = p;
                hunger = h;
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList<Integer> sugers = new LinkedList<>();
        for (int i = 0; i < m; i++)
            sugers.add(sc.nextInt());
        sugers.sort((Integer i1, Integer i2) -> i2 - i1); //从大到小排序
        LinkedList<Bear> bears = new LinkedList<>();
        for (int i = 0; i < n; i++)
            bears.add(new Bear(sc.nextInt(), sc.nextInt()));
        LinkedList<Bear> bears_backup = new LinkedList<>();
        bears_backup.addAll(bears);
        bears.sort((Bear b1, Bear b2) -> b2.power - b1.power);
        for (Bear bear : bears) {
            Iterator<Integer> it = sugers.iterator();
            while (it.hasNext()) {
                int tmp = it.next();
                if (bear.hunger >= tmp) { //不能吃撑（糖不能超过饥饿值）
                    bear.hunger -= tmp;
                    it.remove();
                }
            }
        }
        for (Bear bear : bears_backup) {
            System.out.println(bear.hunger);
        }
    }
}
