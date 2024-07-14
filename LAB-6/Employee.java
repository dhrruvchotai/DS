//34. Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. Write a program to read the detail from user and print it.

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Employee_Detail ed = new Employee_Detail();
        ed.getDetails();
    }

}

class Employee_Detail{
    int Employee_id;
    String Name;
    String Designation;
    int Salary;

    public Employee_Detail(){
        Scanner sc = new Scanner(System.in);

        Employee_id = sc.nextInt();
        Name = sc.next();
        Designation = sc.next();
        Salary = sc.nextInt();
    }

    void getDetails(){
        System.out.println(Employee_id);
        System.out.println(Name);
        System.out.println(Designation);
        System.out.println(Salary);
    }
}


