package dsa.array.basic;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] arr){
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int a: arr){
            hashMap.put(a, hashMap.getOrDefault(a, 0) +1);
        }

        // here return the only number that do not appear two times
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getValue();
            }
        }
        return -1;
    }
}
