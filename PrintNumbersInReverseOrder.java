import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            System.out.println("Numbers In Reverse Order:");
            for(int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}