package dsa.array.basic;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int currentCount = 0;
        int maxCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

        return Math.max(currentCount, maxCount);
    }
}
