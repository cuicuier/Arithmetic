package com.cui.我的笔试.拼多多;

import java.util.*;

/**
 * M 高楼数量
 * N 举办活动所需楼数（举办活动要求N栋楼的高度相同）
 * 数组：表示M栋楼每栋楼的高度
 * 求满足活动需要增加的楼层数
 */
public class 高楼加层 {
    public static void main(String[] args) {
        int[] heights={1,1,2,3,3};
        getAdd(3,heights);
    }
    public static int getAdd(int n,int[] heights){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int addCount=0;
        for (int i=0;i<heights.length;i++){
            if (!map.containsKey(heights[i])){
                map.put(heights[i],1);
            }else {
                map.put(heights[i],map.get(heights[i])+1);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for (Integer key:map.keySet()
             ) {
            list.add(map.get(key));
        }
        Collections.sort(list);


        return 0;
    }


}
