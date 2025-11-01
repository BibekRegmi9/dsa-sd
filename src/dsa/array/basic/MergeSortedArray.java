package dsa.array.basic;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,7,9};
        int[] arr2 = {2,5,6};
        int[] ans = mergeSortedArray(arr1, 5, arr2, 3);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] mergeSortedArray(int[] arr1, int m, int[] arr2, int n){
        int[] copy = arr1.clone();
        int pointer1 = 0;
        int pointer2 = 0;

        for(int i = 0; i < m+n; i++){
            if( pointer2 >= n || (pointer1 < m && copy[pointer1] < arr2[pointer2])){
                arr1[i] = copy[pointer1];
                pointer1++;
            } else {
                arr1[i] = arr2[pointer2];
                pointer2++;
            }

        }
        return arr1;
    }

}
