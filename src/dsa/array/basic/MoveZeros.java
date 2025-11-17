package dsa.array.basic;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
    }

    public static void moveZero(int[] arr){
        int pointer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[pointer] = arr[i];
                pointer++;
            }
        }

        for(int i = pointer; i < arr.length; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
