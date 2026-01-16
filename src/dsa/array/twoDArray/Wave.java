package dsa.array.twoDArray;

public class Wave {
    public static void main(String[] args) {

    }

    public static void wave(int[][] matrix, int row, int col){
        for(int j = 0; j < col; j++){
            if(j % 2 == 0){

                // up to down
               for(int i = 0; i < row; i++){
                   System.out.println(matrix[i][j]);
               }

               // down to up
                for(int i = row-1; i >= 0; i--){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
