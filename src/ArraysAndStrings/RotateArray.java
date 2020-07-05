package ArraysAndStrings;

public class RotateArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for (int i[] : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
    public static void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        flipVertical(matrix);
    }
    public static void transposeMatrix(int[][] matrix){
        int n = matrix.length - 1;
        int temp = 0;
        for(int i = 0; i<=n; i++){
            for(int j = i+1; j<= n;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void flipVertical(int[][] matrix) {
        int n = matrix.length - 1;
        int temp = 0;
        for(int i = 0; i<=n;i++){
            for(int j = 0; j<=n/2;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j];
                matrix[i][n-j]=temp;
            }
        }
    }
}
