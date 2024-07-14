import java.util.Scanner;

public class Lab_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in string = ");
        String name = sc.nextLine(); 
        String temp="";
        String t = "";
        for(int i=0;i<name.length();i++){
            temp=""; 
            if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                temp += name.charAt(i); 
                t += temp.toUpperCase();
            }
            else{
                temp += name.charAt(i); 
                t += temp.toLowerCase();
            }
        }
        System.out.println(t);
        sc.close();
    }
}
