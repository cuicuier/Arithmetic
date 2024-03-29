package com.cui.leetcode.数组;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别
 * 为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int max=0;
        for (int i=0;i<height.length;i++){
            for (int j=height.length-1;j>i;j--){
                int capacity = Math.min(height[i],height[j]) * (j-i);//容积=高度中的较小值*下标差

                    if (max<capacity){
                        max=capacity;
                    }
            }
        }
        return max;

    }


}
