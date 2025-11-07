package src.com.kkdsa.strings;

public class Operators {
    public static void main(String[] args) {
        //these are the different operations we can do on a string.
        // + operator
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 3);
        System.out.println();

        //plus operator only works on primitieves
        String one = 1 + 's' + ""; // this is valid only because we're adding at least one string object in the object declaration
        System.out.println(one);
    }
}
