import java.util.Scanner;

public class PrintAllFactorsOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            System.out.println("Factors Of " + n + ":");
            for(int i = 1; i <= n; i++) {
                if(n % i == 0)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}