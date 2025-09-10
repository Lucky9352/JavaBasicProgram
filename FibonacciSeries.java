import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number Of Terms: ");
            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: ");
            for(int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
        System.out.println();
    }
}