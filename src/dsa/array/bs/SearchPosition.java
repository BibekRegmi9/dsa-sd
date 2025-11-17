package dsa.array.bs;

public class SearchPosition {
    public static void main(String[] args) {

    }

//    https://leetcode.com/problems/search-insert-position/description/
    public static int solution(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ansIndex = arr.length;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;

            } else {
                ansIndex = mid;
                end = mid - 1;

            }

        }
        return ansIndex;
    }
}
