package com.cui.赛码网.基本算法;


public class YueDeEr {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str = sc.nextLine();
//        String str2=sc.nextLine();

//        String out=yuedeer(str,str2);
        String out=yuedeer("@!%12dgsa","010111100");
        System.out.println(out);

    }
    public static String yuedeer(String str,String str2){

        str=str.replaceAll("[0-9A-Za-z]","1");
        str=str.replaceAll("[^0-9A-Za-z]","0");
        System.out.println(Integer.parseInt(str2,2));
        int a=(Integer.parseInt(str,2))^(Integer.parseInt(str2,2));
        System.out.println(a);
        String[] out=Integer.toBinaryString(a).split("");
        int count=0;
        for(int i=0;i<out.length;i++){
            if(out[i].equals("1")){
                count++;
            }
        }
        int strLength=str.toCharArray().length;
        double similar=1-(double)count/strLength;

        String string = String.format("%.2f",similar*100)+"%";
        return string;
    }
}
