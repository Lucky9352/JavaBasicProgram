import java.util.Scanner;

public class PrintAllPrimesBetween1ToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            System.out.println("Prime Numbers Between 1 And " + n + ":");
            for(int i = 2; i <= n; i++) {
                if(isPrime(i))
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}