public class BinarySerch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int indx = binarySerch(arr, 0, arr.length-1, 2);

        if(indx == -1){
            System.out.println("Elmt not found!!");
        }
        else{
            System.out.println("Elmt is at index :"+indx);
        }

    }

    public static int binarySerch(int arr[],int low,int high,int elmt){

        int mid = (low+high)/2;

        if(elmt == arr[mid]){
            return mid;
        }

        else if(elmt < arr[mid]){
            return binarySerch(arr,low,mid-1,elmt);
        }

        else if(elmt > arr[mid]){
           return binarySerch(arr,mid+1,high,elmt);
        }

        return -1;

    }
}
