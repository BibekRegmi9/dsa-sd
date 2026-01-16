package dsa.strings;

import java.util.Arrays;

public class RotatedBy2Place {
    public static void main(String[] args) {
        String a = "amazon";
        String b = "azonam";
        System.out.println(solution(a, b));
    }

    public static boolean solution(String a, String b){
        String one = rotateClockWise(a);
        one = rotateClockWise(one);
        System.out.println(one);

        String two = rotateAntiClockWise(b);
        two = rotateAntiClockWise(two);
        System.out.println(two);
        return one.equals(two);
    }

    public static String rotateClockWise(String a){
        char[] str = a.toCharArray();
         char last = str[str.length-1];
         for(int i = str.length-1; i > 0; i--){
             str[i] = str[i-1];
        }
         str[0] = last;

         return new String(str);
    }

    public static String rotateAntiClockWise(String a){
        char[] str = a.toCharArray();
        char first = str[0];
        for(int i = 1; i < str.length; i++){
            str[i-1] = str[i];
        }
        str[str.length-1] = first;

        return new String(str);
    }

}
