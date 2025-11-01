package dsa.array.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 3, 1, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int smallestIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            swap(arr, smallestIndex, i);
        }

    }

    public static void selectionSortRev(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int smallestIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            swap(arr, smallestIndex, i);
        }

    }


    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
