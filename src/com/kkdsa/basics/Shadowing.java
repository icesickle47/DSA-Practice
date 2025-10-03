package com.kkdsa.basics;

public class Shadowing {
    static int x = 1298; // this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);
        fun();
        int x = 20;
        System.out.println(x);
    }

    static void fun() {
        System.out.println(x);
    }
}
