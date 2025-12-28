package dsa.array.prefixSuffix;

public class MaxSubArrayORKadaneAlgo {
    public static int solution(int[] arr){
        int max = Integer.MIN_VALUE;
        int prefix = 0;
        for(int i = 0 ; i  < arr.length; i ++){
            prefix += arr[i];
            max = Math.max(max, prefix);

            if(prefix < 0){
                return 0;
            }
        }
        return max;
    }
}
