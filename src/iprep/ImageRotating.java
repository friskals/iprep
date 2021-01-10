package iprep; 

    public class ImageRotating {
        
      static int[][] rotateImage(int[][] a) {
       
        int n = a.length;
        
        //Transpose the matrix
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        //Flip horizontally
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n/2; j++){
                int temp = a[i][n-j-1];
                a[i][n-j-1] = a[i][j];
                a[i][j] = temp;
            }
        }
        
        return a;
    }

    static void printMatrix(int[][] matrix){
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
       int[][] matrix = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printMatrix(rotateImage(matrix));
    }
}
