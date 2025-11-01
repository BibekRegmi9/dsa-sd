package dsa.array.basic;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 6, 9, 10, 10};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr){
        int pointer1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[pointer1]){
                pointer1++;
                arr[pointer1] = arr[i];
            }
        }
        return pointer1+1;

    }
}
