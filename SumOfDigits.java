import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            int sum = 0;
            while(n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("Sum Of Digits: " + sum);
        }
    }
}