package dsa.array.two_pointer;

import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

    }

    public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        // code Here
        for(int i = 0; i < arr.length-2; i++){
            int ans = target - arr[i];
            int start = i+1;
            int end = arr.length-1;

            while(start < end){
                if(arr[start] + arr[end] == ans) return true;
                else if(arr[start] + arr[end] > ans){
                    end--;
                } else {
                    start++;
                }
            }
        }
        return false;
    }
}
