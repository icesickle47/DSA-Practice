package com.kkdsa.basics;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        switchTest();
    }

    public static void switchTest(){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String condom = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("the best tropical fruit ever");
            case "apple" -> System.out.println("keeps the doctor away");
            case "orange" -> System.out.println("sweet and sour full of vitamin c");
            case "grapes" -> System.out.println("these like to bunch together");
            default -> System.out.println("oops! that is not a fruit");
        }

        switch (condom) {
            case "magnum":
                System.out.println("the only right size for mayank");
                break;
            case "air":
                System.out.println("feels the best");
                break;
            case "mutual":
                System.out.println("when she wants to be dug for hours");
                break;
            case "flavoured":
                System.out.println("when she wants some flavoured creme ;)");
                switch(fruit){
                    case "mango" -> System.out.println("the best tropical fruit ever");
                    case "apple" -> System.out.println("keeps the doctor away");
                    case "orange" -> System.out.println("sweet and sour full of vitamin c");
                    case "grapes" -> System.out.println("these like to bunch together");
                    default -> {
                        System.out.println("oops! that is not a fruit");
                    }
                }
            default:
                System.out.println("oops! that is not a fruit");
                break;
        }

    }
}
