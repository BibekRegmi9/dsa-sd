package dsa.array.bs;

public class MountainArray {
    public static void main(String[] args) {

    }

    public static int findMinInMountainArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = arr[0];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] >= arr[0]){
                start = mid + 1;
            } else {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}
