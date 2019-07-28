package com.cui.我的笔试.on360;

import java.util.*;

public class 整理彩球 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//彩球个数
        int[] arr = new int[n]; // 保存各彩球的颜色
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(get(arr));
    }

    public static int get(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for (Integer num:map.keySet()
             ) {

            list.add(map.get(num)); //将各个颜色秋的数量存入列表
        }
        Collections.sort(list); //对球的数量排序
        int mixNum=list.get(0); //最少数量的球
        if (mixNum<2){
            return 0;
        }
        int count=1; //篮子的数量
        for (int i=1;i<list.size();i++){ // 遍历后面的球数
            if (list.get(i)%mixNum == 0){ //该颜色的球的数量是mixNum的整数倍
                count+=list.get(i)/mixNum;
            }else {
                count=0;
                break;
            }
        }
        return count;

    }
}
