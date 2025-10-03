package com.kkdsa.basics;

import java.util.Scanner;

public class Sum2Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the numbers you want to add");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        float sum = num1 + num2;

        System.out.println("the sum is :" + sum);
    }
}
