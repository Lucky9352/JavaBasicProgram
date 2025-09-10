import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            int temp = n, rev = 0;
            while(temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if(n == rev)
                System.out.println(n + " Is A Palindrome");
            else
                System.out.println(n + " Is Not A Palindrome");
        }
    }
}