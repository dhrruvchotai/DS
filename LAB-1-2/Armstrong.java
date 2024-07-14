import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        double count=0;
        for(int i=1;i<num;i++){
            int main=i;
            while(main>0){
                int temp = main%10;
                count = count + Math.pow(temp, 3);
                main /= 10;
            }
            if(count == i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}