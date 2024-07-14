//22. Write a program to delete a number from a given location in an array.

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int location = 4;
        int length = 5;

        int n1 [] = {1,4,7,2,3};

        for(int i=location; i<length-1; i++){
            
            n1[i] = n1[i+1];
           
        }

        for(int i = 0; i<length-1; i++){
            System.out.print(n1[i] + " ");
           }
    }    
}
