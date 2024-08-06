public class QuickSort1 {
        public static void main(String[] args) {
            int arr[] = {2,3,7,5,8,9,4};
            QuickSort q1 = new QuickSort();
    
            q1.qc(arr,0,6);
    
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    
        }
    }
    class QuickSort{
        public static int partition(int[] arr, int low, int high){
            int pivot = low;
            int i = low;
            int j = high;
    
            while(i < j){
                while(arr[i] <= arr[pivot] && i < high){
                    i++;
                }
                while(arr[j] > arr[pivot] && j > low){
                    j--;
                }
                if(i < j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
    
            return j;
        }
    
        public static void qc(int[] arr, int low, int high){
            if(low < high){
                int pIndex = partition(arr, low, high);
                qc(arr, low, pIndex-1);
                qc(arr, pIndex+1, high);
            }
        }
}

