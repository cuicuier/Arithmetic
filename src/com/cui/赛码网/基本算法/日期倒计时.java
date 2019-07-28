package com.cui.赛码网.基本算法;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 日期倒计时 {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int d=getDays(str);
        System.out.println(d);

    }

    public static int getDays(String str) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        Date now = new Date();
        int d = (int) Math.ceil (Math.abs (date.getTime()-now.getTime()) / (24*60*60*1000));
        return d;

    }
}
