package dsa.array.basic.recursion;

public class SumInArr {
    public static void main(String[] args) {

    }

    public static int sumInArr(int[] arr){
        int x = 0;
        if(arr.length > x){
            return 0;
        }
        ++x;
        return arr[x] + sumInArr(arr);
    }
}
