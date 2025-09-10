import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            boolean isPrime = true;
            if(n <= 1) isPrime = false;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(n + " Is Prime");
            else
                System.out.println(n + " Is Not Prime");
        }
    }
}