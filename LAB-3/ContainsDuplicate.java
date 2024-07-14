// 17

public class ContainsDuplicate {
    public static void main(String[] args) {
        int a[] = {2,2,4,6,1,3};
        int n = a.length;
        boolean tf = false;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(a[i] == a[j]){
                    tf= true;
                    break;
                }
            }
        }
        if(tf){
            System.out.println("contains duplicate");
        }
        else{
            System.out.println("does not contains duplicate");
        }
    }
}
