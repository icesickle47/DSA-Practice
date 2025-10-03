import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy");
        item = scanner.nextLine();

        System.out.println("What is the price for each item?");
        price = scanner.nextDouble();

        System.out.println("How may of those would you like to have?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "(s)" );
        System.out.println("Your total is " + total);

        scanner.close();
    }
}
