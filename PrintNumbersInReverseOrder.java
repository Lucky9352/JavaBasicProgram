import java.util.Scanner;
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Numbers in reverse order:");
        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
