import java.util.Objects;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        int age;

        System.out.println("please tell us your age");
        age = scanner.nextInt();
//        String yesNo;

        if (age >= 18) {
            System.out.println("You are an adult");
        }
        else if( age <= 0){
            System.out.println("You are yet to be born");
        }
        else {
            System.out.println("Do you want to see cat pictures? kid");
        }

        scanner.close();
    }
}
