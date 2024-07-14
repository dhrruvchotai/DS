public class MatrixMult {
    public static void main(String[] args) {
       int [][] b = {
        {1,1,1},
        {1,1,1}
       };

       int [][] a = {
        {1,1},
        {1,1},
        {1,1}
       };    

       int [][] c = new int[3][3];

       for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<2; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                
            }
       }

      
       for(int i = 0; i<=2; i++){
        for(int j = 0; j<=2; j++){
           System.out.print(c[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
