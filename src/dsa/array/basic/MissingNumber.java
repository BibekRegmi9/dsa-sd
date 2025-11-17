package dsa.array.basic;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {

    }

    public static int missingNo(int[] arr){
        //rules
        // XOR of a number with itself is 0
        // XOR of a number with 0 is the number

        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor ^= i;
        }

        // XOR each element in nums
        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        return total - sum;
    }


    public int missingNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }

}
