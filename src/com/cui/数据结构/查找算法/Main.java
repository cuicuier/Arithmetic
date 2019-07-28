package com.cui.数据结构.查找算法;

public class Main {
    private static int[] a = {10, 2, 56, 7, 23, 54, 66, 66, 21}; //无序
    private static int[] b = {2, 7, 10, 21, 23, 54, 56, 66, 66}; //有序
    private static int target=66;
    public static void main(String[] args) {

        System.out.println("顺序查找:"+target+"的位置为:"+SequenceSearch.sequenceSearch(a,target));
        System.out.println("二分查找:"+target+"的位置为:"+BinarySearch.binarySearch(b,target));
        System.out.println("二分查找:"+target+"的位置为:"+BinarySearch.binarySearch2(b,target,0,b.length));
    }
}
