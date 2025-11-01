package dsa.array.basic;

public class ReverseString {
    public static void main(String[] args) {
        String ans = reverseString("hello");
        System.out.println(ans);
    }

    public static String reverseString(String str){
        int start  = 0;
        int end = str.length()-1;
        char[] string = str.toCharArray();
        while (start < end){
            swap(string, start, end);
            start++;
            end--;
        }
        return new String(string);
    }

    public static void swap(char[] string, int start, int end){
        char temp = string[start];
        string[start] = string[end];
        string[end] = temp;
    }
}
