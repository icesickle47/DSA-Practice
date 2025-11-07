package src.com.kkdsa.strings;

public class PracticeStr {
    public static void main(String[] args) {
        String name1 = "Jumma";
        //strings are IMMUTABLE in JAVA
        // you cannot edit a string
        // but what you can do is create a new string object and assign to the previously declared variable
        String name2 = "Jumma";
        String name3 = new String("Jamun");
        String name4 = new String("Jamun");
        String name5 = new String("Jumma");

        /*CONDITION
        * if we're going to be comparing strings
        * the == comparison operator will check if the reference variable is pointing to the same object in the string pool
        * if it is pointing to the same object in the string pool it will return true
        * otherwise it will return false i.e the variables are pointing towards different string objects*/

        System.out.println(name1 == name2); // true, since its the same object in the string pool
        System.out.println(name3 == name4); // false since its a new different object for both
        System.out.println(name1 == name5); // false since its a new different object for both

        System.out.println("checking if two strings (different reference variables) contain the same value");
        System.out.println(name1.equals(name5));
        System.out.println(name1.equals(name4));

        //x-x-x-x-x-x-x-xx-x-x-x-x-x-x-x-x
        // FORMATTED STRINGS

        System.out.printf("hello I am pi, my value is: %.5f", Math.PI);
        // the value .5 denotes how many digits it will show

        System.out.printf("\nhello I am %s and my last name is %s", "sexy","saxena");
    }
}
