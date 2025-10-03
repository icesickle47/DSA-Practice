package com.kkdsa.arrays;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(4);
        list.add(1);
        list.add(123);
        list.add(134);
        list.add(1342);
        list.add(14);
        list.add(14);
        list.add(1);
        list.add(14);
        list.add(12);
        list.add(12);
        list.add(1);
        list.add(15);
        list.add(1);
        list.add(12);
        list.add(100);
        System.out.println(list );

        //operations that can be performed on the list - see more in teh ArrayList Class
        System.out.println(list.get(3)); // returns value at index 3
        list.set(3, 45); // changes value at index 3 and sets it to 45
        System.out.println(list.get(3)); // returns value at index 3

        System.out.println(list);
    }
}
