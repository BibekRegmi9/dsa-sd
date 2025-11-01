package dsa.array.basic;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] arr, int target){
        int pointer = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != target){
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static int rd(int[] arr, int target){
        int pointer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != target){
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        return pointer;
    }
}
