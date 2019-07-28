package com.cui.剑指offer.一位运算;


public class NumOf1 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(13));
        System.out.println(findZero(13));

    }

    /**
     * 二进制中1的个数
     *
     * n&(n-1) 相当于依次把二进制中最右边的1变成0
     * 进行几次操作，就表示有几个1
     */
    public static int NumberOf1(int n){
        int count=0;
        while (n!=0){
            n=n & (n-1); //相当于依次把二进制中最右边的1变成0
            count++;
        }
        return count;
    }

    /**
     * 二进制中0的个数
     *
     * 每次右移一位，判断是否是0
     * n & 1 是否为0
     */
    public static int findZero(int n){
        int count=0;
        while (n!=0){
            if((n & 1)!=1){ //表示n的最后一位为0
                count++;
            }
            n>>=1;
        }
        return count;
    }

    /**
     * 二进制高位连续0的个数
     *
     */
    public static int numberOfLeadingZeros0(int i){
        if (i == 0)
            return 32;
        int n = 1;
        if (i >>> 16 == 0) { n += 16; i <<= 16; }
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }
        n -= i >>> 31;
        return n;

//        if(i == 0)
//            return 32;
//        int n = 0;
//        int mask = 0x80000000;
//        int j = i & mask;
//        while(j == 0){
//            n++;
//            i <<= 1;
//            j = i & mask;
//        }
//        return n;
    }

}
