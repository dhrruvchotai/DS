public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,2,1,9};
       
        for(int i=0;i<=(arr.length-2);i++){
            for(int j=i+1;j<(arr.length-1);j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("the arr is");  for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
    }
}
