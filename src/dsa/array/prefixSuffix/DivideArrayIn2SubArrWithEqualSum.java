package dsa.array.prefixSuffix;

public class DivideArrayIn2SubArrWithEqualSum {
    public static void main(String[] args) {

    }

    public static int prefix(int[] arr){
        int totalSum = 0;
        int prefix = 0;
        for(int i = 0 ; i  < arr.length; i++) {
            totalSum += arr[i];
        }

        for(int i = 0 ; i  < arr.length-1; i++) {
            prefix += arr[i];

            int ans = totalSum - prefix;

            return ans == prefix ? 1 : 0;
        }
        return 0;
    }


    // brute-force
    public static int prefixBruteForce(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j <= i; j++){
                sum1 += arr[j];
            }

            for(int j = i+1; j < arr.length; j++){
                sum2 += arr[j];
            }

            return sum1 == sum2 ? 1 : 0;
        }
        return 0;
    }
}
