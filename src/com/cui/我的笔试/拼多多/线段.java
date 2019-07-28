package com.cui.我的笔试.拼多多;

import java.util.*;

/**
 * 有n条线段
 * 一个点至少同时属于k条线段，则符合要求
 * 给定n条线段的左右端点
 * 求符合条件的点组成的最少线段数量
 */
public class 线段 {
    public static void main(String[] args) {
//        int[][] nums={
//                {0,5},{-3,2},{3,8}
//        };
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[][] nums=new int[n][2];
        for (int i=0;i<n;i++){
            nums[i][0]=in.nextInt();
            nums[i][1]=in.nextInt();
        }
        getN(2,nums);
    }
    public static void getN(int k,int[][] nums){


        //计算每条线段的端点出现的次数(属于几条线段)
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){//遍历每条线段的端点
            int left=nums[i][0];
            int right=nums[i][1];
            for (int j=0;j<nums.length;j++){
                int left2=nums[j][0];
                int right2=nums[j][1];

                if (left>=left2 && left<=right2){
                    if (map.containsKey(left)){
                        map.put(left,map.get(left)+1);
                    }else {
                        map.put(left,1);
                    }
                }
                if (right>=left2 && right<=right2){
                    if (map.containsKey(right)){
                        map.put(right,map.get(right)+1);
                    }else {
                        map.put(right,1);
                    }
                }

            }
        }

        List<Integer> list=new ArrayList<Integer>();
        for (Integer key :
                map.keySet()) {
            if (map.get(key)>=k){
                list.add(key);
            }
        }
        if (list.size()%2==0){
            System.out.println(list.size()/2);
            for (int i=0;i<list.size()-1;i+=2){
                System.out.print(list.get(i)+" "+list.get(i+1));
                System.out.println();
            }
        }


    }


}
