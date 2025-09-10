import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Number: ");
            int n = sc.nextInt();
            if(n % 2 == 0)
                System.out.println(n + " Is Even");
            else
                System.out.println(n + " Is Odd");
        }
    }
}