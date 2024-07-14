import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = {"meet","mann","darsahn","rajkot","Amadavad"};
        Arrays.sort(name);
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        sc.close(); 
    }
}
