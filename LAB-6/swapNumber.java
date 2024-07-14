//33. Write a program to swap two numbers using user-defines method.

import java.util.Scanner;

public class swapNumber{
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        swap(a, b);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}