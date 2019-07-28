package com.cui.往届题练习.今日头条;

import java.util.Scanner;

/**
 * 我们规定对一个字符串的shift操作如下：
 * shift(“ABCD”, 0) = “ABCD”
 * shift(“ABCD”, 1) = “BCDA”
 * shift(“ABCD”, 2) = “CDAB”
 * 换言之, 我们把最左侧的N个字符剪切下来, 按序附加到了右侧。
 * 给定一个长度为n的字符串，我们规定最多可以进行n次向左的循环shift操作。
 * 如果shift(string, x) = string (0＜= x ＜n), 我们称其为一次匹配(match)。求在shift过程中出现匹配的次数。
 */
public class 左侧剪切匹配 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        int matchCount=1;
        for (int x=1;x<string.length();x++){
            String left=string.substring(x);
            String right=string.substring(0,x);
//
//            if ((left+right).equals(string)){
//                matchCount++;
//            }
            StringBuilder sb=new StringBuilder();
            sb.append(left).append(right);

            if (sb.toString().equals(string))
                matchCount++;

        }
        System.out.println(string);
        System.out.println(matchCount);
    }

}
