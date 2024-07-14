// 16

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of arr");
        int n = sc.nextInt();
        int a[] = new int[n];
        

        for(int i =0; i< n; i++){
            a[i]=sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        int minind = 0;
        int maxind = 0;

        for(int i = 0; i<n; i++){
            if(min>a[i]){
                min = a[i];
                minind = i;
            }
            else if(max < a[i]){
                max = a[i];
                maxind = i;
            }
        }
        System.out.println("minimum is found at "+ minind+ " which is " +min);
        System.out.println("maximum is found at "+ maxind+ " which is " +max);

    }    
}
