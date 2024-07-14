public class Replace {
    public static void main(String[] args) {
        int a [] = {1,3,5,4,8,11,13,9};
        
        int first = 4;
        int second = 9;

        for(int i = 0; i<a.length; i++){
            if(a[i] == first){
                a[i] = second;
                System.out.print("Replacement found at index "+i+" ");
                System.out.println();
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
