package com.cui.leetcode.动态规划;

/**
 * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 *
 * 最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
 *
 * 选出任一 x，满足 0 < x < N 且 N % x == 0 。
 * 用 N - x 替换黑板上的数字 N 。
 * 如果玩家无法执行这些操作，就会输掉游戏。
 *
 * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。假设两个玩家都以最佳状态参与游戏。
 *
 * 思路：谁碰到1必输，所有碰到2必赢
 * 从2向后推导，两人以最佳状态参赛，意味着两人都知道取哪个约数使自己必胜
 * Alice是先手，偶数必胜（自己取1，使bob遇到奇数，此时Bob只能取奇数，这样Alice仍碰到偶数，最后到2，Alice胜）
 */
public class 除数博弈 {
    public boolean divisorGame(int N) {
        return N % 2 == 0 ? true : false;
    }
}
