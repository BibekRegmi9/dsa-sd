package dsa.array.basic;

public class CountDigit {
    public static void main(String[] args) {
        int ans = countDigits(-11000);
        System.out.println(ans);
    }

    public static int countDigits(int no){

        //edge case 1
        if(no == 0) {
            return 1;
        }

        // edge case 2: eg: -5676
        no = Math.abs(no);

        int count = 0;
        while(no > 0){
            no = no /10;
            count++;
        }
        return count;
    }
}
