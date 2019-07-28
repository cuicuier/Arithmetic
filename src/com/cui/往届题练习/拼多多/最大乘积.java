package com.cui.往届题练习.拼多多;

import java.util.*;

/**
 * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
 */
public class 最大乘积 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(getMaxPro(nums));
    }
    /*
    基本思路： 用选择排序的思路找到最大的3个数和最小的2个数 时间复杂度O(6n)
    最大乘积只有两种情况
    1.最大的三个数相乘
    2.最小的两个负数再乘以最大的正数
    从这两种中取最大的即可
     */
    public static int getMaxPro(int[] nums){
        int length=nums.length;
        Arrays.sort(nums);

        int max1=nums[0]*nums[1]*nums[length-1];
        int max2=nums[length-3]*nums[length-2]*nums[length-1];
//        System.out.println(max1);
//        System.out.println(max2);

        return max1>max2? max1:max2;



    }


}
