package dsa.array.basic.pattern;

public class Basic {

//    *****
//    *****
//    *****
    public static void main(String[] args) {
        patternSecondApproach(5);
    }

    public static void pattern(int n) {

        for(int i = 0; i < n; i++){
            System.out.println("");
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
        }
    }

    public static void patternSecondApproach(int n) {

        for(int i = 0; i < n; i++){
            String gg = "";
            for(int j = 0; j < n; j++){
                gg += "*";
            }
            System.out.println(gg);
        }
    }


}
