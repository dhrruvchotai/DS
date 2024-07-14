import java.util.Scanner;

public class CelsiusFahrenhit {
    public static void main(String[] args) {
        System.out.println("Enter 1 to convert c to f & enter 2 to convert from f to c: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        
        if(a == 1){
            System.out.println("Enter celsius:");
            double c = sc.nextDouble();
            ctof(c);
        }
        else if(a == 2){
            System.out.println("Enter fahrenhit:");
            double f = sc.nextDouble();
            ftoc(f);
        }
        else{
            System.out.println("bhai kidhu m kar ne...");
        }
    }

    public static void ctof(double c){
       System.out.println(((9*c)/5)+32);
    }

    public static void ftoc(double f){
        System.out.println(((f-32)*5)/9);
    }
}
