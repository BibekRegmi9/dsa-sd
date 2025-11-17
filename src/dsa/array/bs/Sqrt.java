package dsa.array.bs;

public class Sqrt {
    public static void main(String[] args) {

    }

//    https://leetcode.com/problems/sqrtx/description/
    public static int squareRoot(int x){
        int start = 0;
        int end = x;
        int ans = -1;

        if(x < 2){
            return x;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid == x/mid){
                return mid;
            } else if (mid < x/mid) {
                ans = mid;
                start = mid + 1;
            } else {
                return mid-1;
            }
        }
        return ans;
    }
}
