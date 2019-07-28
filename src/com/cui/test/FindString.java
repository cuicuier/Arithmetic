package com.cui.test;


import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        String[] subs=new String[m];
        for (int i=0;i<m;i++){
            subs[i]=sc.nextLine();
        }
        String str=sc.nextLine();

        int count=getSubNum(str,subs);
        System.out.println(count);

    }
    public static int getSubNum(String str,String[] subs){


        int count=0;
        for (int i=0;i<subs.length;i++){

            int j=0;
            String a1="";
            int index=str.indexOf(subs[i].charAt(j));
            if(index!=-1){
                a1=str.substring(index,index+subs[i].length()-1);
//                System.out.print(a1);
            }
            for(int i1=0;i1<a1.length();i1++){
                if(a1.charAt(i1)==subs[i].charAt(i1)){
                    count++;
                    str=str.substring(index)+" "+str.substring(index+subs[i].length()-1);

                }else {
                    continue;
                }
            }



        }

        return count;
    }
}
