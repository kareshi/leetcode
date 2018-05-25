package easy.array.rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        int depth = (matrix.length +1) / 2;
        for(int row=0; row<depth; row++) {
            int max = matrix.length - 1;
            for(int col=row; col<matrix.length - row - 1 ; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[max-col][row];
                matrix[max-col][row]= matrix[max-row][max-col];
                matrix[max-row][max-col] = matrix[col][max - row];
                matrix[col][max - row] = temp;
            }
        }
    }
}