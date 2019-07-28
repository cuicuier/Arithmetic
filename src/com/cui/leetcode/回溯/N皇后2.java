package com.cui.leetcode.回溯;

import java.util.*;

/**
 * 如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。（任意两个皇后不能处于同一行、同一列或同一斜线）
 * 返回所有不同的解决方案的数量
 */
public class N皇后2 {


    private static int count=0; //合法摆放方式的个数

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(totalNQueens(n));
    }
    public static int totalNQueens(int n) {
        int[] hash=new int[n+1];

        placeQueen(1,n,hash);
        return count;
    }

    public static void placeQueen(int m,int n,int[] hash){//m表示正在摆放第m个皇后

        if (m>n){//如果摆到了第n+1行，表示所有皇后已放完，前n行都是不冲突的
            count++;
        }

        for (int j=1;j<=n;j++){
            if (isConflict(m,j,hash)){//放在第j列冲突。看第j+1列
                continue;
            }else {//第j列不冲突
                hash[m]=j; //将皇后m放在第j列
                placeQueen(m+1,n,hash); //再放第m+1个皇后

            }

        }

    }

    /**
     * 检测冲突
     * @param row 行号
     * @param column 列号
     * @return
     */
    private static boolean isConflict(int row,int column,int[] hash){
        if (row==1){ //第1行永远不会冲突
            return false;
        }

        //只需保证与已经放好的皇后不冲突
        for (int i=1;i<row;i++){
            if (hash[i]==column || Math.abs(row-i)==Math.abs(column-hash[i])){
                //列号相同或在同一斜线上，则冲突
                return true;
            }
        }
        return false;
    }


}
