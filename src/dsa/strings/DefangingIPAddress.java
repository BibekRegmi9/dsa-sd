package dsa.strings;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String ip = "1.1.1";
        System.out.println(solution(ip));
    }

    public static String solution(String ip){
        char[] address = ip.toCharArray();
        int index = 0;
        String ans = "";
        while (index < address.length){
            if(address[index] == '.'){
                ans = ans + "[.]";
            } else {
                ans = ans + address[index];
            }
            index++;
        }

        return ans;
    }
}
