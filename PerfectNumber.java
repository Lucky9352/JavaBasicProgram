import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n % i == 0)
                    sum += i;
            }
            if(sum == n)
                System.out.println(n + " Is A Perfect Number");
            else
                System.out.println(n + " Is Not A Perfect Number");
        }
    }
}