//35. Create array of object of class Student_Detail with attributes Enrollment_No, Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.Scanner;

public class Student {
    static Student_Detail [] s = new Student_Detail[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        for(int i = 0; i<5; i++){
            s[i] = new Student_Detail();
            s[i].Enroll = sc.next();
            s[i].Name = sc.next();
            s[i].semester = sc.nextInt();
            s[i].cpi = sc.nextFloat();
            System.out.println();
        }

        for(int i = 0; i<5; i++){
            print(i);
            System.out.println();
        }
        
    }
    public static void print(int i){
        System.out.println(s[i].Enroll);
        System.out.println(s[i].Name);
        System.out.println(s[i].semester);
        System.out.println(s[i].cpi);
    } 
    
}

class Student_Detail{
    String Enroll;
    String Name;
    int semester;
    float cpi;

   
}
