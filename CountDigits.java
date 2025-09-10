import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            int count = 0;
            int temp = Math.abs(n);
            if(temp == 0) count = 1;
            while(temp != 0) {
                count++;
                temp /= 10;
            }
            System.out.println("Number Of Digits: " + count);
        }
    }
}