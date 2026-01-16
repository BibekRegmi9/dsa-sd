package dsa.array.twoDArray;

import java.util.Arrays;

public class Add2Matrix {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] arr2 = {
                {7, 8, 9},
                {1, 2, 3}
        };
        addMatrix(arr1, arr2);
    }

    public static void addMatrix(int[][] arr1, int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // print matrix
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
