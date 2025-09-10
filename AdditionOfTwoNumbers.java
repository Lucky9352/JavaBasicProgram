import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum: " + sum);
        }
    }
}