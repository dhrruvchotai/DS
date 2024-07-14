import java.util.Scanner;

public class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account A = new Account();
        System.out.println("Enter your bank balance = ");
        A.balance = sc.nextDouble();
       
        boolean b = true;
        System.out.println(".............what You want to do..................");
        System.out.println("........Enter \'withdrow\' for withdrowing........ ");
        System.out.println("........Enter \'deposit\' for withdrowing........ ");
        System.out.println("........Enter \'puru\' for withdrowing........ ");

        while (b) {
    
            String s = sc.nextLine();
            

            if (s.equals("withdrow")) {
                A.Withdrow();
                System.out.println("..so now...what You want to do..................");
            }
            if (s.equals("deposite")) {
                A.deposit();
                System.out.println("..so now...what You want to do..................");
            } 
            if(s.equals("puru")){
                b = false;
            }
            
        }

        sc.close();
    }
}

class Account {

    double balance;
    Scanner sc = new Scanner(System.in);

    public void deposit() {
        double Dtemp;

        System.out.println("enter how much money you want to deposit = ");
        Dtemp = sc.nextDouble();
        balance += Dtemp;
        System.out.println("Tamaru Balance = " + balance);

    }

    public void Withdrow() {
        double Wtemp = 0;
        System.out.println("Enter how much money you want to withdrow = ");
        try {
            while (Wtemp < balance) {
                Wtemp = sc.nextDouble();

                if (Wtemp > balance) {
                    throw new Aukkat();
                } else {
                    balance -= Wtemp;
                }
            }
        } catch (Aukkat A) {
            System.out.println(A.getMessage());
        }
        System.out.println("Tamaru Balance = " + balance);

    }
}

class Aukkat extends Exception {
    Aukkat() {
        super("Pela balance to jo vala.................");
    }
}
