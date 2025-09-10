import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping: a = " + a + ", b = " + b);
        }
    }
}