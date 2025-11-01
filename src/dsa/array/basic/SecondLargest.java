package dsa.array.basic;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7 ,9, 0, 6, 11};
//        System.out.println(secondLargest(arr));
        System.out.println(findSecondLargestOptimized(arr));
    }

    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > secondLargest && secondLargest < largest){
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }

    public static int findSecondLargestOptimized(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
//            } else if(arr[i] > secondLargest) {
            } else if(arr[i] > secondLargest && arr[i] != largest) { // to skip duplicate value
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
