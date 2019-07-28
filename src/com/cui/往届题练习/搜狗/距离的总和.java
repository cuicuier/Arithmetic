package com.cui.往届题练习.搜狗;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 定义两个大于2的偶数之间的距离，为这两个数之间质数的个数。从小到大输入n个大于2的偶数，
 * 输出所有数两两之间距离的总和（应该有n*(n-1)/2个距离，输出总和就好)。
 */
public class 距离的总和 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>(n);
        for (int i=0;i<n;i++){
            arrayList.add(in.nextInt());
        }
        System.out.println(getSum(arrayList));

    }
    /**
     * 求两两数字之间质数的总和
     */
    public static int getSum(ArrayList<Integer> arrayList){
        int size=arrayList.size();
        if (size==2)
            return getPrimeCount(arrayList.get(0),arrayList.get(1));

        int last=arrayList.remove(size-1);
        int lastSum=0;
        for (int i=0;i<arrayList.size();i++){
            lastSum+=getPrimeCount(arrayList.get(i),last);
        }

        return lastSum + getSum(arrayList);
    }

    /**
     *
     * 时间复杂度较高
     * 需要找出计算sum的公式
     */
    public static int getSum2(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                sum+=getPrimeCount(arr[i],arr[j]);
            }
        }
        return sum;
    }


    /**
     *
     * 求数字num1和num2之间的质数的数目
     */
    public static int getPrimeCount(int num1,int num2){
        int count=0;//记录质数的数目
        for (int i=num1;i<=num2;i++){
            boolean flag=true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

    /**
     *
     * 判断一个数是否是质数
     */
    public static boolean isPrime(int num){
        boolean flag=true; //标志该数是否是质数
        for (int i=2;i<Math.sqrt(num);i++){
            if (num % i == 0){//i是num的一个因子
                flag=false;  //num不是质数
                break;  //不用再继续循环
            }

        }
        return flag;
    }


}
