public class HeapSort {
    public static void main(String[] args) {

        int[] arr = new int[]{4,10,3,5,1};

        Solution s = new Solution();

        int ans[] = s.heapSort(arr);

        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("]");

    }
}

class Solution{

    public static void heapify(int arr[],int n,int i){

        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n,largest); 
        }
    }

    public static int[] heapSort(int arr[]){

        int n = arr.length;

        for(int i = (n/2 - 1); i>=0; i--){
            heapify(arr, n, i);
        }

        for(int i = n-1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        return arr;
    }


    
}
