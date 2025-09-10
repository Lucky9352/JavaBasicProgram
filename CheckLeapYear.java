import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A Year: ");
            int year = sc.nextInt();
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                System.out.println(year + " Is A Leap Year");
            else
                System.out.println(year + " Is Not A Leap Year");
        }
    }
}