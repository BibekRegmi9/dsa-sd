package dsa.array.bs;

import java.util.Arrays;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 12, 15};
        int[] ans = solution(arr, 8);
        System.out.println(Arrays.toString(ans));
    }

//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static int[] solution(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int firstElement = -1;
        int lastElement = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                firstElement = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // find last
        start = 0;
        end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                lastElement = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] {firstElement, lastElement};
    }

    public static int[] bruteforceSolution(int[] arr, int target){
        int firstPos = -1;
        int lastPos = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                firstPos = i;
                break;
            }
        }

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == target){
                lastPos = i;
                break;
            }
        }

        return new int[] {firstPos, lastPos};
    }
}
