import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            int temp = n, sum = 0;
            int digits = String.valueOf(n).length();
            while(temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if(sum == n)
                System.out.println(n + " Is An Armstrong Number");
            else
                System.out.println(n + " Is Not An Armstrong Number");
        }
    }
}