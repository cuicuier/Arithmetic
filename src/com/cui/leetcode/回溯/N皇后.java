package com.cui.leetcode.回溯;

import java.util.*;

/**
 * 如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。（任意两个皇后不能处于同一行、同一列或同一斜线）
 * 返回所有不同的解决方案
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 */
public class N皇后 {

//    private static int n;//皇后的个数
//    private static int[] hash;//下标i表示第i号皇后，值表示放的列号
    private static int count=0; //合法摆放方式的个数

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<List<String>> lists=solveNQueens(n);
        System.out.println(lists.toString());

    }
    public static List<List<String>> solveNQueens(int n) {
        int[] hash=new int[n+1];
        List<List<String>> lists=new ArrayList<>();
        placeQueen(1,n,hash,lists);
        return lists;
    }

    public static void placeQueen(int m,int n,int[] hash, List<List<String>> lists){//m表示正在摆放第m个皇后

        if (m>n){//如果摆到了第n+1行，表示所有皇后已放完，前n行都是不冲突的
            List<String> list = new ArrayList<>();
            count++;
            System.out.println(Arrays.toString(hash)); //打印合法的摆放结果
            for (int i=1;i<=n;i++){
                int column=hash[i]; //皇后i所在的列号
                StringBuilder sb=new StringBuilder();
                for (int j=1;j<=n;j++){
                    if (j!=column){ //该列没有放皇后，用"."表示
                        System.out.print(".");
                        sb.append(".");
                    }else {
                        System.out.print("Q"); //该列放了皇后，用Q表示
                        sb.append("Q");
                    }
                }
                System.out.println(); //第i行结束，换行
                list.add(sb.toString());
            }

            lists.add(list);
            return;
        }

        for (int j=1;j<=n;j++){
            if (isConflict(m,j,hash)){//放在第j列冲突。看第j+1列
                continue;
            }else {//第j列不冲突
                hash[m]=j; //将皇后m放在第j列
                placeQueen(m+1,n,hash,lists); //再放第m+1个皇后

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
