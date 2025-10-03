package com.kkdsa.basics;

import java.util.Scanner;

public class FunctionsMethods {
    public static void main(String[] args) {

    }
    public static void firstFunc(){
        System.out.println("this function does nothing but print this");
    }
    public static void firstFunc(int num){
        System.out.println("now ur function prints a number \n which is");
        System.out.println(num);
    }
    /*
    * this is the sum function
    * and I have overridden it to work in various different ways*/
    private static int sum(){
        System.out.println("Please enter the two numbers you want to add");
        System.out.println("Enter number one");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter number two");
        int b = in.nextInt();
        return a + b;
    }
    private static int sum(int a, int b){
        return a + b;
    }
    private static void sum(int a, int b, boolean display){
        int sum = a + b;
        if (display){
            System.out.println("the sum is :" + sum);
        }
    }

    public static void swap(int a, int b){ // this won't swap the values
        int temp = a;
        a = b;
        b = temp;
    }



}
