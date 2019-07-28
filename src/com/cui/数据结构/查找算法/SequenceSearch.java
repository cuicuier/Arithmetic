package com.cui.数据结构.查找算法;

public class SequenceSearch {
    /**
     * 查出目标值target在数组a中的索引位置
     * 思路：遍历数组，一个一个比较，找到目标值则返回索引
     * 时间复杂度 O(n)
     * @param a
     * @param target
     * @return
     */
    public static int sequenceSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return -1; // 表示target不在数组a中
    }
}
