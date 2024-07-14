// 14

import java.util.Scanner;

public class SumFromMtoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int x = sc.nextInt();
       
       
        int sum = 0;
        int arr [] = new int [x];

        for(int i =0; i< x; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter startin number");
        int m = sc.nextInt();

        System.out.println("Enter End number");
        int n = sc.nextInt();

        for(int i = m; i<=n; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}