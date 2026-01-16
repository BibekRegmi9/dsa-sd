package dsa.array.majority;

import java.util.ArrayList;
import java.util.HashMap;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(solution(arr));
        sol(arr);
    }

//    https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?utm_medium=article_practice_tab&utm_campaign=article_practice_tab&utm_source=geeksforgeeks

    // using hashmap
    public static ArrayList<Integer> solution(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr){
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 1; i <= arr.length; i++){
            if(!hashMap.containsKey(i)){
//                missing = i;
                ans.add(i);
            } else if (hashMap.get(i) > 1) {
//                repeating = i;
                ans.add(i);
            }
        }
        return ans;
    }

    // optimal method
    public static void sol(int[] arr){
        int missing = -1;
        int repeating = -1;

        int [] count = new int[arr.length];
        for(int i = 0 ;  i < arr.length; i++){
            count[arr[i] -1]++;
        }

        for(int i = 0 ; i < arr.length; i++){
            if(count[i] == 0){
                missing = i+1;
            } else if(count[i] > 1) {
                repeating = i+1;
            }
        }

        System.out.println(missing);
        System.out.println(repeating);
    }

}
