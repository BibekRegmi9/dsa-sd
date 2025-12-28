package dsa.array.prefixSuffix;

public class MaxDifferenceBetween2Element {
    public static void main(String[] args) {

    }

    public static int sol(int[] arr){
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i  < arr.length-1; i++){

            for(int j = i+1 ; j < arr.length; j++){
                maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
            }
        }
        return maxDiff;
    }
}
