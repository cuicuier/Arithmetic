package com.cui.剑指offer.回溯法;

import java.util.Scanner;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class 机器人的运动范围 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int k=in.nextInt();
        System.out.println(movingCount(k,m,n));
    }


    /**
     * 思路：利用递归实现，每次只能走上下左右四个点，进行判断点的位置是否越界，点数之和是否大于K，是否已经走过了。
     *
     */
    public static int movingCount(int threshold, int rows, int cols) {
        int[][] flag=new int[rows][cols];//标记格子是否走过
        return helper(0,0,rows,cols,threshold,flag);

    }

    private static int helper(int i, int j, int rows, int cols, int threshold, int[][] flag) {
        if (i<0 || i>=rows || j<0 || j>=cols
                || flag[i][j]==1 || nums(i)+nums(j) > threshold)
            return 0;
        flag[i][j]=1;//标识该为已经走过
        return helper(i-1,j,rows,cols,threshold,flag)
                +helper(i+1,j,rows,cols,threshold,flag)
                +helper(i,j-1,rows,cols,threshold,flag)
                +helper(i,j+1,rows,cols,threshold,flag)
                +1;
    }

    /*
    计算一个数各个位的和
     */
    private static int nums(int i) {
        int sum=0;
        while (i>0){
            sum+=i%10;
            i=i/10;
        }
        return sum;
    }
}
