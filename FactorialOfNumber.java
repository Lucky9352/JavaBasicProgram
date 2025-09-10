import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            long fact = 1;
            for(int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        }
    }
}