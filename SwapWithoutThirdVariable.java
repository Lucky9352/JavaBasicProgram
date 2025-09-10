import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After Swapping: a = " + a + ", b = " + b);
        }
    }
}