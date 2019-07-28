package com.cui.赛码网.基本算法;

import java.util.*;

public class ArrReverce {
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
        Collections.sort(arrList);

        int start=0;
        int end=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                start=i;
                break;
            }
        }
        for (int i=start+1;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                end=i;
                break;
            }
        }
        for (int j=start;j<=(start+end)/2;j++){
            int temp=arr[j];
            arr[j]=arr[start+end-j];
            arr[start+end-j]=temp;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arrList.get(i)) {
                flag = false;
                System.out.println(arr[i]);
                System.out.println(arrList.get(i));
                break;
            }

        }

        return flag;
    }
}
