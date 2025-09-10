import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            System.out.print("Enter Third Number: ");
            int c = sc.nextInt();
            int largest = a;
            if(b > largest) largest = b;
            if(c > largest) largest = c;
            System.out.println("Largest: " + largest);
        }
    }
}