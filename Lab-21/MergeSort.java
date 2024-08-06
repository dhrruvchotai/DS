import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        
        int arr[] = {3,2,4,1,3}; 

        int high = arr.length - 1;
        Solution s = new Solution();
        s.mergesort(arr, 0,high);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

class Solution{
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void mergesort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
}
