package dsa.array.basic;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr1 = {1,3,5,7,2,8,10};
//        System.out.println(bruteForceSolution(arr));
        System.out.println(optimalSolution(arr1));
    }

    public static int optimalSolution(int[] arr){
        int profit = 0;
        int minVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
            if(arr[i] - minVal > profit){
                profit = arr[i] - minVal;
            }
        }
        return profit;
    }

    public static int bruteForceSolution(int[] arr){
        int profit = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] - arr[i] > profit){
                    profit = arr[j] - arr[i];
                }
            }
        }
        return profit;
    }
}
