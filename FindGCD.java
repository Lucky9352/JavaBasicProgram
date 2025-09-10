import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            int gcd = 1;
            for(int i = 1; i <= Math.min(a, b); i++) {
                if(a % i == 0 && b % i == 0)
                    gcd = i;
            }
            System.out.println("GCD: " + gcd);
        }
    }
}