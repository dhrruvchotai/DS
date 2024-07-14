//23. Write a program to insert a number in an array that is already sorted in an ascending order.

public class AddInSortedArray {
    public static void main(String[] args) {
        int element = 4;
        int n1 [] = {1,1,2,3,5,7,9};
        int n = 7;
        int n2 [] = new int [n + 1];
        
      int i = 0;
      while (n1[i] < element) {
        n2[i] = n1[i];
        i++;
      }

      n2[i] = element;
      i++;

      while (i < n+1) {
        n2[i] = n1[i-1];
        i++; 
      }

      for(int j = 0; j<n +1; j++){
        System.out.print(n2[j] + " ");
      }
    }    
}
