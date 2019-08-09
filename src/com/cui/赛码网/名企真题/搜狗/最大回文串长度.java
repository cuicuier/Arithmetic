package com.cui.赛码网.名企真题.搜狗;

import java.util.Scanner;
import java.util.Stack;

/**
 * 求一个字符串的最大回文前缀长度。回文是指正反方向读起来都一样的字符串，
 * 比如“abcdcba”就是一个回文。
 */
public class 最大回文串长度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getLength(str));
        System.out.println(get("sougou"));

    }
    /**
     * 我的代码
     * @param string
     * @return
     */
    public static int getLength(String string){
        int length=0;
        int low=0;
        Stack<Character> stack=new Stack();
        for (int i=string.length()-1;i>low;i--){
            if (string.charAt(low)==string.charAt(i)){
                low++;
                stack.push(string.charAt(low));
                length+=2;

            }else {
                if (stack.isEmpty())
                    continue;
                else
                    stack.clear();
                    low=0;
            }
            if (low+1==i)
                length++;


        }
        if (length==0){
            length=1;
        }

        return length;


    }
    /**
     * 完全通过的代码
     */
    public static int get(String str){
        int start=0;
        int end=str.length()-1;
        int count=str.length()-1;
        while (start<=end){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else {
                start=0;
                end--;
                count=end;
            }
        }

        count=count+1;
        return count;
    }


}
