package dsa.array.bs;

import java.util.Arrays;

public class BookAllocation {

    public static void main(String[] args) {

    }

    public static int findPages(int[] arr, int k){

        if(k > arr.length){
            return -1;
        }

        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int page = 0;
            int count = 1;

            for(int i = 0; i < arr.length; i++){
                page += arr[i];
                if(page > mid){
                    count++;
                    page = arr[i];
                }
            }
            if(count <= k){
                ans = mid;
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
