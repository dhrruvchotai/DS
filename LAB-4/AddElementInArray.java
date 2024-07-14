//21. Write a program to insert a number at a given location in an array. 

public class AddElementInArray {
    public static void main(String[] args) {
        int location = 3;
        int element = 2;
        int length = 5;
        int n1 [] = {1,3,6,12,52};
        int n2 [] = new int [length+1];
        
        

        for(int i = 0; i< length+1; i++){
            if(i<location){
                n2[i] = n1[i];
            }
            if(i == location){
                n2[i] = element;
            }
            if(i>location){
                n2[i] = n1[i-1];
            }
        }

       for(int i = 0; i<length+1; i++){
        System.out.print(n2[i] + " ");
       }
    }    
}
