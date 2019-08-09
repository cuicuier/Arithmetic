package com.cui.赛码网.基本算法;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 股神 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入天数n：");

        int n=scanner.nextInt();
        System.out.println(getGujia(n));

    }
    public static int getGujia(int n){
        List<Integer> gujia=new ArrayList<Integer>(n);

        gujia.add(1);
        int upCount=1;

        int i=1;
        while(i<n){

            for (int j=1;j<=upCount;j++){

                gujia.add(i,gujia.get(i-1)+1);
                i=i+1;
            }
            if(i<n){

                gujia.add(i,gujia.get(i-1)-1);
                i=i+1;
                upCount++;
            }



        }
        return gujia.get(gujia.size()-1);
    }

}
