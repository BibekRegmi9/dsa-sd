package dsa.array.basic.recursion;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfNNumber(4));
    }

    public static int sumOfNNumber(int n){
        if(n < 1){
            return 0;
        }

        return n + sumOfNNumber(n-1);
    }
}
