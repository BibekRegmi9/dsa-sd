package dsa.array.two_pointer;

import java.util.Arrays;

public class Segregate0And1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};

        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solution(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] == 0){
                start++;
            } else {
                if(arr[end] == 0){
                    swap(arr, start, end);
                    start++;
                    end--;
                } else {
                    end--;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
