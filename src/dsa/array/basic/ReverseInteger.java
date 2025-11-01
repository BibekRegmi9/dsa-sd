package dsa.array.basic;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }

    public static int reverse(int no){
        int originalNo = no;
        no = Math.abs(no);
        int revNo = 0;
        while(no > 0){
            int lastDigit = no % 10;
            revNo = (10 * revNo) + lastDigit;
            no = no / 10;
        }

        double limit = Math.pow(2, 31);
        if(revNo < -limit || revNo > limit){
            return 0;
        }

        return originalNo < 0 ? -revNo : revNo;
    }
}
