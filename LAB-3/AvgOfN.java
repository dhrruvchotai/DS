// 15

import java.util.Scanner;

public class AvgOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of arr");
        int n = sc.nextInt();
        int a[] = new int[n];
        

        for(int i =0; i< n; i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += a[i];
        }

        int avg = sum/n;
        System.out.println(avg);
    }
}

