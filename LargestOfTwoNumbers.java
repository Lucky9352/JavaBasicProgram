import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            if(a > b)
                System.out.println(a + " Is Largest");
            else if(b > a)
                System.out.println(b + " Is Largest");
            else
                System.out.println("Both Are Equal");
        }
    }
}