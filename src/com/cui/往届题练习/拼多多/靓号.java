package com.cui.往届题练习.拼多多;

import java.util.Scanner;

/**
 * A 国的手机号码由且仅由 N 位十进制数字(0-9)组成。一个手机号码中有至少 K 位数字相同则被定义为靓号。
 * A 国的手机号可以有前导零，比如 000123456 是一个合法的手机号。
 * 小多想花钱将自己的手机号码修改为一个靓号。修改号码中的一个数字需要花费的金额为新数字与旧数字之间的差值。
 * 比如将 1 修改为 6 或 6 修改为 1 都需要花 5 块钱。
 * 给出小多现在的手机号码，问将其修改成一个靓号，最少需要多少钱？
 *
 * 输入：
 * 第一行包含2个整数 N、K，分别表示手机号码数字个数以及靓号至少有 K 个数字相同。
 * 第二行包含 N 个字符，每个字符都是一个数字('0'-'9')，数字之间没有任何其他空白符。表示小多的手机号码。
 * 数据范围：
 * 2 <= K <= N <= 10000
 * 输出：
 * 第一行包含一个整数，表示修改成一个靓号，最少需要的金额。
 * 第二行包含 N 个数字字符，表示最少花费修改的新手机号。若有多个靓号花费都最少，则输出字典序最小的靓号。
 *
 * 例子：
 * 输入：
 * 6 5
 * 787585
 * 输出：
 * 4
 * 777577
 */
public class 靓号 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        String s=scanner.next();
        StringBuffer ans=null;
        int res=(int)1e9;
        for(int i=0;i<10;i++){
            StringBuffer t=new StringBuffer(s);
            int p=K,c=0;
            for(int j=0;j<10;j++){
                for(int l=0;l<N;l++){
                    if(p!=0&&t.charAt(l)-'0'==i+j){
                        p--;
                        t.setCharAt(l,(char)(i+'0'));
                        c=c+j;
                    }
                }
                if(j!=0)
                    for(int l=N-1;l>=0;l--)
                        if(p!=0&&t.charAt(l)-'0'==i-j){
                            p--;
                            t.setCharAt(l,(char)(i+'0'));
                            c=c+j;
                        }
            }
            if(c<res){
                res=c;
                ans=t;
            }


        }
        System.out.println(res);
        System.out.println(ans);

    }
}
