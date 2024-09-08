public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,2,1,9};
       
        for(int i=0;i<(arr.length-1);i++){
            for(int j=0;j<(arr.length-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("the arr is");  

        for(int i=0;i<arr.length;i++){   
            System.out.println(arr[i]);
        }
    }
}
