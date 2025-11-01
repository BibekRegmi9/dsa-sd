package dsa.array.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }

    public static boolean isPalindrome(int no){
        if(no < 0) return false;

        int originalNo = no;
        int reverse = 0;

        while(no > 0){
            int lastDigit = no % 10; //remainder
            reverse = (10 * reverse) + lastDigit;
            no = no / 10;
        }
        return reverse == originalNo;
    }
}
