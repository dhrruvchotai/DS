//24. Write a program to delete a number from an array that is already sorted in an ascending order.

public class DelenElementFromSortedArray {
    public static void main(String[] args) {
        int element = 4;
        int length = 5;
        int n [] = {1,2,3,4,6};
        int n2 [] = new int [length - 1];
        int low = 0;
        int high = length-1;
        int index = -1;

        while(low<=high){
            int mid = (high+low)/2;

            if(n[mid] == element){
               index = mid; 
               break;
            }

            if(element > n[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        for(int i = 0,j = 0; i< length; i++){
            if(i != index){
                n2[j++] = n[i];
            }
           
        }

        for(int i = 0; i < n2.length; i++) {
            System.out.print(n2[i] + " ");
        }
    }
}
