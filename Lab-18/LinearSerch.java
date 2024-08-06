public class LinearSerch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int indx = linearSerch(arr, 0);

        if(indx == -1){
            System.out.println("Elmt not found!!");
        }
        else{
            System.out.println("Elmt is at index :"+indx);
        }


    }
    public static int linearSerch(int arr[],int elmt){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == elmt){
                return i;
            }
        }

        return -1;
    }

}