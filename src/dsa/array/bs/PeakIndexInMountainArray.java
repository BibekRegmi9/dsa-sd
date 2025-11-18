package dsa.array.bs;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
       int[] arr = {2, 4, 6, 8, 10, 8, 5};
        System.out.println(peakIndexInMountainArr(arr));
    }

    // 2 4 6 8 10 8 5
    public static int peakIndexInMountainArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid] > arr[mid-1]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
