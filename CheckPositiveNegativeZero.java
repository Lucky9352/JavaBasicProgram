import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            if(n > 0)
                System.out.println(n + " Is Positive");
            else if(n < 0)
                System.out.println(n + " Is Negative");
            else
                System.out.println("Number Is Zero");
        }
    }
}