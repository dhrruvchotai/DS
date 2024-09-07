public class RadixSort {
    public static void main(String[] args) {

        int arr[] = new int[]{121,432,564,23,1,45,788};

        Solution s = new Solution();

        int place = 1;

        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        while((max / place) > 0){
            arr = s.radixort(arr, arr.length, place);
            place *= 10;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Solution{

    public int[] radixort(int[] arr,int n,int place){

        int count[] = new int[10];
        int output[] = new int[n];


        for(int i=0;i<n;i++){
            count[(arr[i] / place) % 10]++;
        }

        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }

        for(int i = n-1;i>=0;i--){
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        return arr;
    }
}
