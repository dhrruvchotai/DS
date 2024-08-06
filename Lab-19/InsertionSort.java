public class InsertionSort {
    public static void main(String[] args) {
        
        int arr[] = new int[]{9,15,14,12,6,8,13};
        
       for(int i=0;i<arr.length;i++){
        int j = i;
        while((j>0) && (arr[j-1] > arr[j])){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp; 
            j--;
        }
       }

       for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
       }
    }
}
