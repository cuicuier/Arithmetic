package com.cui.往届题练习.拼多多;

import java.util.Scanner;

/**
 * 你在玩一个回合制角色扮演的游戏。现在你在准备一个策略，以便在最短的回合内击败敌方角色。在战斗开始时，敌人拥有HP格血量。
 * 当血量小于等于0时，敌人死去。一个缺乏经验的玩家可能简单地尝试每个回合都攻击。但是你知道辅助技能的重要性。
 * 在你的每个回合开始时你可以选择以下两个动作之一：聚力或者攻击。
 *     聚力会提高你下个回合攻击的伤害。
 *     攻击会对敌人造成一定量的伤害。如果你上个回合使用了聚力，那这次攻击会对敌人造成buffedAttack点伤害。否则，会造成normalAttack点伤害。
 * 给出血量HP和不同攻击的伤害，buffedAttack和normalAttack，返回你能杀死敌人的最小回合数。
 *
 * 输入：
 * 第一行是一个数字HP
 * 第二行是一个数字normalAttack
 * 第三行是一个数字buffedAttack
 * 1 <= HP,buffedAttack,normalAttack <= 10^9
 * 输出：最小回合数
 *
 * 例子：
 * 输入:
 * 13
 * 3
 * 5
 * 输出：5
 *
 * 思路：蓄力攻击需要消耗两轮（第一轮蓄力，第二轮攻击），若蓄力攻击使敌人掉血量>两轮正常攻击的掉血量，则一直采用蓄力攻击，
 *         当最后一轮敌人血量<normalAttack时，使用正常攻击
 *       若蓄力攻击掉血量<两轮正常攻击掉血量，则一直采用正常攻击
 * */
public class 回合制游戏 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int normalAttack = scanner.nextInt();
        int buffedAttack = scanner.nextInt();
        System.out.println(huiheNum(hp,normalAttack,buffedAttack));

    }

    public static int huiheNum(int hp, int normalAttack, int buffedAttack) {
        int huihe=0;
        if (buffedAttack > normalAttack * 2) {//蓄力攻击优于两轮正常攻击
            huihe = hp / buffedAttack;
            huihe = huihe * 2;
            hp = hp % buffedAttack;
            if (hp != 0) {
                if (hp <=normalAttack) {
                    huihe++;
                } else {
                    huihe += 2;
                }
            }
        } else {
            huihe = hp / normalAttack;
            if (hp % normalAttack != 0) {
                huihe++;
            }
        }
        return huihe;
    }
}
