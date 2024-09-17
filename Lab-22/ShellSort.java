public class ShellSort{
    public static void main(String[] args) {
        
        int arr[] = new int[]{21,38,29,17,4,25,11,32,9};
        Solution s= new Solution();
        int ans[] = s.ShellSort(arr, arr.length);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}

class Solution{

    public int[] ShellSort(int[] arr,int n){
        int gap = n/2;

        while (gap > 0){
            for(int i = gap; i<n; i++){

                int anchor = arr[i];
                int j  = i;

                while(j >= gap && arr[j-gap] > anchor){
                    arr[j] = arr[j-gap];
                    j = j - gap;
                }

                arr[j] = anchor;

            }

            gap = gap / 2;
        }

        return arr;
    }

}