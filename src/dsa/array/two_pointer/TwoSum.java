package dsa.array.two_pointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = solution(arr, 9);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solution(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] + arr[end] == target){
                return new int[] {start+1, end+1};
            } else if(arr[start] + arr[end] < target){
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
}
