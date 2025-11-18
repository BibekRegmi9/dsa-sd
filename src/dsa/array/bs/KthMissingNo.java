package dsa.array.bs;

public class KthMissingNo {
    public static void main(String[] args) {

    }

//    https://leetcode.com/problems/kth-missing-positive-number/description/
    public static int solution(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] - mid -1 >= k) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return ans+k;
    }
}
