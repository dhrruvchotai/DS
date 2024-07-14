import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int total = (n*(n+1)*(n+2))/6;
        System.out.println("Your ans is = "+total);
        sc.close();
    }
}
