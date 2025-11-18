package dsa.array.bs;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(searchInRotatedArr(arr, 0));
    }

    public static int searchInRotatedArr(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) /2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > arr[0]) {
                if(arr[start] <= target && arr[mid] > target){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(arr[mid] <= target && arr[end] >= target){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
