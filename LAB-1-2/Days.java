import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days = ");
        int days = sc.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;
        System.out.printf("year = %d,month = %d,days = %d",years,weeks,remainingDays);
        sc.close();
    }
}
