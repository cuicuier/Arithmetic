package com.cui.leetcode.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */

/**
 * 有两个测试用例超时
 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};

        List<List<Integer>> lists=threeSum(nums);
        System.out.println(lists.size());

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();

        for (int i=0;i<nums.length-2;i++){
            for (int j=i+1;j<nums.length-1;j++){
                for (int k=nums.length-1;k>j;k--){

                    List<Integer> list=new ArrayList<>();
                    if (nums[i]+nums[j]+nums[k] == 0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!lists.contains(list)){
                            lists.add(list);
                        }
                        break;
                    }
                }
            }

        }
        return lists;
    }

}
