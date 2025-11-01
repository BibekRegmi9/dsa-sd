package dsa.array.basic.pattern;

public class Pattern1 {

//    *
//    **
//    ***
//    ****
//    *****

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i = 0; i < n; i++){
            String pattern = "";
            for(int j = 0; j < i+1; j++){
                pattern += "*";
            }
            System.out.println(pattern);
        }
    }
}
