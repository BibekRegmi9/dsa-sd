package dsa.array.twoDArray;


public class MaxSumRow {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {1, 2, 2},
                {1, 2, 1}
        };

        System.out.println(rowWithMaxSum(matrix1));

    }

    public static int rowWithMaxSum(int[][] arr){
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int total = 0;
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
            if(total > sum){
                sum = total;
            }
        }
        return sum;
    }
}
