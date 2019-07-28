package com.cui.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {


    }
    public static int calculateY(int m){
        int year=0;
        if(m<2)
            return 0;
        if(m==2 || m==3)
            return 1;

        List<Integer> nums=new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        for(int i=2;i<=100;i++){
            int a=nums.get(i-1)+nums.get(i-2);
            if(m<=a && m>nums.get(i-1)){

                year=i+1;
                break;
            }else {
                nums.add(a);
            }
        }
        return year;


    }
    public static int calculateN(int m){
        if(m==1)
            return 2;
        if(m==2)
            return 3;
        if(m==3)
            return 4;
        return calculateN(m-2)+calculateN(m-3);
    }
    public static int[] calculate(int m,int k){
        int[] arr=new int[3];
        arr[0]=calculateN(m);
        arr[1]=calculateY(m);
        return arr;
    }
    public static List<Integer> getTopK(int m,int k){
        List<Integer> nums=new ArrayList<>();
        return nums;

    }

}
