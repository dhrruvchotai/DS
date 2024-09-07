import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int arr[] = new int[]{5,1,12,-5,16,2,12,14};

      int len = arr.length;
      
      for(int j=0;j<=(len-2);j++){
        int mini = j;

        for(int k=j;k<=(len-1);k++){
            if(arr[k]<arr[mini]){
                mini = k;
            }
        }

        int temp = arr[j];
        arr[j] = arr[mini];
        arr[mini] = temp;
      }

      for(int x = 0;x<len;x++){
        System.out.println(arr[x]);
      }
    }
}
