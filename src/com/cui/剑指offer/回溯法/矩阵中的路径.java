package com.cui.剑指offer.回溯法;



/**
 * 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中
 * 向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，
 * 但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class 矩阵中的路径 {
    public static void main(String[] args) {
        char[] matrix=new char[]{'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] str=new char[]{'b','c','c','e','d'};
        char[] str2=new char[]{'a','b','c','b'};
        char[] str3=new char[]{'f','d','e','d'};
        char[] str4=new char[]{'f','d','e','e'};
        System.out.println(hasPath(matrix,3,4,str));
        System.out.println(hasPath(matrix,3,4,str2));
        System.out.println(hasPath(matrix,3,4,str3));
        System.out.println(hasPath(matrix,3,4,str4));
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag=new int[matrix.length];//记录格子是否走过
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (helper(i,j,matrix,rows,cols,str,0,flag))
                    return true;
            }
        }
        return false;


    }
    private static boolean helper(int i,int j,char[] matrix,int rows,int cols,char[] str,int k,int[] flag){//k表示str的索引
        int index=i*cols+j;//index表示i,j映射到一维数组matrix的索引
        if (i<0 || i>=rows || j<0 || j>=cols
                || flag[index]==1 || matrix[index]!=str[k])
            return false;
        flag[index]=1;
        if (k==str.length-1){//k是str的最后一个字符
            return true;
        }
        if (helper(i-1,j,matrix,rows,cols,str,k+1,flag)
                || helper(i+1,j,matrix,rows,cols,str,k+1,flag)
                || helper(i,j-1,matrix,rows,cols,str,k+1,flag)
                || helper(i,j+1,matrix,rows,cols,str,k+1,flag))
            return true;
//        flag[index]=0;

        return false;
    }
}
