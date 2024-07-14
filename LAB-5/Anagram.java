import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array....");
        int n = sc.nextInt();
        String[] s = new String[n];
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        sc.nextLine();
        System.out.println("Enter number between 1 to n-1");
        int num = sc.nextInt();
        System.out.println(s[num]);

        System.out.println("Enter your Anagram.....");
        String temp = sc.nextLine();
        sc.nextLine();

        for (int i = 0; i < temp.length(); i++) {
            for (int j = 0; j < temp.length(); j++) {
                if (s[num].charAt(i) == temp.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == temp.length()) {
            System.out.println("Number enterd by you is anagram");
        } else {
            System.out.println("Number enterd by you is NOT a anagram");
        }
        sc.close();
    }
}
