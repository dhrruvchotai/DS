//25. Write a program to delete duplicate numbers from an array. 

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 6, 4, 2, 9};
        int n = a.length;

        Arrays.sort(a);

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
