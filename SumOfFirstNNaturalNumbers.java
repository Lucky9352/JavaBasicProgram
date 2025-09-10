import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            int sum = n * (n + 1) / 2;
            System.out.println("Sum Of First " + n + " Natural Numbers: " + sum);
        }
    }
}