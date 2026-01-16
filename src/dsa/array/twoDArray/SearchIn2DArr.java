package dsa.array.twoDArray;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        int[] ans = search(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

    }

    public static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

