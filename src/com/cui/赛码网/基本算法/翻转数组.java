package com.cui.赛码网.基本算法;

import java.util.*;

/**
 * 给定一个长度为n的整数数组a，元素均不相同，问数组是否存在这样一个片段，只将该片段翻转就可以使整个数组升序排列。其中数组片段[l,r]表示序列a[l], a[l+1], ..., a[r]。原始数组为
 *
 * a[1], a[2], ..., a[l-2], a[l-1], a[l], a[l+1], ..., a[r-1], a[r], a[r+1], a[r+2], ..., a[n-1], a[n]，
 *
 * 将片段[l,r]反序后的数组是
 *
 * a[1], a[2], ..., a[l-2], a[l-1], a[r], a[r-1], ..., a[l+1], a[l], a[r+1], a[r+2], ..., a[n-1], a[n]。
 */
public class 翻转数组 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag=reverse(arr);
        if(flag){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    public static boolean reverse(int[] arr){
        if(arr.length==1)
            return true;

        boolean flag=true;
        List<Integer> arrList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            arrList.add(arr[i]);
        }
        Collections.sort(arrList); //排好序了

        int start=0;
        int end=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){//查找前一个数比后一个数大的位置
                start=i;
                break;//找到第一个符合条件的位置就跳出循环，作为片段的开头
            }
        }
        for (int i=start+1;i<arr.length;i++){
            if(arr[i]<arr[i+1]){//查找小于后面数的位置，作为片段的结尾
                end=i;
                break;
            }
        }
        for (int j=start;j<=(start+end)/2;j++){
            int temp=arr[j];
            arr[j]=arr[start+end-j]; //目标片段翻转
            arr[start+end-j]=temp;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arrList.get(i)) {
                flag = false; //只要翻转后某个元素不符合排序好的元素，失败
                break;
            }

        }

        return flag;
    }
}
