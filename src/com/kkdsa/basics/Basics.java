package com.kkdsa.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10;
        {
            System.out.println("here we are printing");
        }

        while (a > 0){
            System.out.println(a);
            a--;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("we are in the for loop " + i);
        }
    }
}
