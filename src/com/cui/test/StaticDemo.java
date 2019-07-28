package com.cui.test;

public class StaticDemo {

    public static void main(String[] args) {
        System.out.print(B.c);
    }
}

class A {
    static {
        System.out.print("A");
    }

    // 测试：只能选择其中一种一条语句
//     public static final String c = "C"; // C
//     public static  String c = "C"; // AC
//     public static final String c = new String("C"); // AC
//    public static String c = new String("C"); // AC
}

class B extends A {
//         public static final String c = "C"; // C
//     public static  String c = "C"; // ABC
//     public static final String c = new String("C"); // ABC
    public static String c = new String("C"); // ABC
    static {
        System.out.print("B");
    }

}
