package dsa.array.twoDArray;

import java.util.List;

public class Spiral {
    public static void main(String[] args) {

    }

    public void spiralOrder(int[][] matrix) {
        List<Integer> ans;
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int right = col-1;
        int bottom = row-1;
        int left = 0;

        while(left <= right && top <= bottom){
            // print top
            for(int j = 0; j <= right; j++){
                System.out.print(matrix[top][j]);
                top++;
                System.out.println();
            }

            // print right
            for(int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right]);
                right--;
                System.out.println();
            }

            if(top <= bottom) {
                // print bottom
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j]);
                    bottom--;
                    System.out.println();
                }
            }

            if(left <= right) {
                // print left
                for (int i = bottom; i >= top; i--) {
                    System.out.println(matrix[i][left]);
                }
            }
        }
    }
}
