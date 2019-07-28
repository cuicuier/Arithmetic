package com.cui.leetcode.数组;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class 寻找两个有序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        List<Integer> list=new ArrayList(length1+length2);
        for (int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        if (list.size()%2==0){
            return (list.get(list.size()/2-1)+list.get(list.size()/2))/2;
        }else
            return list.get(list.size()/2-1);



    }


}
