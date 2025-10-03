package com.kkdsa.basics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //type casting
        int num = (int)(123.5234f);
        System.out.println(num);

        //autopmatic type promotion in expressions
        int a = 257;
//        byte b = (byte)(a);

        System.out.println();

        //after this we have type promotion rules
        byte b = 12;

    }
}
