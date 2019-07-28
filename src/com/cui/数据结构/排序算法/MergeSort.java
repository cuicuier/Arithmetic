package com.cui.数据结构.排序算法;

public class MergeSort {
    public static int[] sort(int[] a,int left,int right){
        if(left==right){
            return new int[]{a[left]};
        }
        int mid=(left+right)/2;
        int[] l=sort(a,left,mid);
        int[] r=sort(a,mid+1,right);
        return merge(l,r);
    }
    public static int[] merge(int[] l,int[] r){
        int[] result=new int[l.length+r.length];
        int p=0;
        int lp=0;
        int rp=0;
        while (lp<l.length && rp<r.length){
            result[p++]=l[lp]<r[rp] ? l[lp++]:r[rp++];
        }
        while (lp<l.length){
            result[p++]=l[lp++];
        }
        while (rp<r.length){
            result[p++]=r[rp++];
        }

        return result;
    }
}
