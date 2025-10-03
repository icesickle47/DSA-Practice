public class JavaVariables {
    //variables are reusable containers for storing and accessing data in a program while its running
    // Primitive = simple value stored directly in memory(stack)
    // Reference = memory address(in the stack) that points to the heap

    // Primitive variables vs Reference Variables
    // -------------------    -------------------
    // int double char boolean    String Array Object

    public static void main(String[] args) {
        System.out.println("hello we are testing printing different variables in Java today");
        int year = 2025;
        int age = 25;
        int quantity = 1;

        double percentage = 90.5;
        double price = 19.99;

        String name = "mayank";
        boolean isStudent = false;
        boolean isBored = true;
        String email = "fake123@gotgmail.com";
        String color = "red";
        String car = "Mustang";
        boolean forSale = true;

        System.out.println("hello " + name + " how are you today?");
        System.out.println("you are " + age + " years old");

    }

}
