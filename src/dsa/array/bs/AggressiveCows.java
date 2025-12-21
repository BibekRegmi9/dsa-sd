package dsa.array.bs;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

    }

    public static int solution(int[] arr, int k){
        Arrays.sort(arr);

        int start = 1;
        int end = arr[arr.length-1] - arr[0];
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int count = 1;
            int pos = arr[0];

            for(int i = 1; i < arr.length; i++){
                if(pos + mid <= arr[i]){
                    count++;
                    pos = arr[i];
                }
            }

            if(count < k){
                end = mid-1;
            } else {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}
