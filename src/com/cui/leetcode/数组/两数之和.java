package com.cui.leetcode.数组;

/**
 * 给定一个整数数组nums 和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;

    }
    public static int[] twoSum(int[] nums,int target){
        int[] sum=new int[2];
        boolean flag=false;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    sum[0]=i;
                    sum[1]=j;
                    flag=true;
                    break;
                }

            }
            if (flag)
                break;
        }
        return sum;
    }

}
