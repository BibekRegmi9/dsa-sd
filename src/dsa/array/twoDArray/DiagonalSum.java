package dsa.array.twoDArray;

public class DiagonalSum {
    public static void main(String[] args) {

    }

    public static void sum(int[][] matrix, int row, int col){
        int first = 0;
        int second = 0;

        // first diagonal
        int i = 0;
        while(i < row){
            first += matrix[i][i];
        }

        //second diagonal
        i = 0;
        int j = col-1;
        while(j >= 0){
            second += matrix[i][j];
            i++;
            j--;
        }

        System.out.println(first);
        System.out.println(second);
    }
}
