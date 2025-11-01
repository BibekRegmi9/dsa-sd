package dsa.array.basic.pattern;

//    12345
//    1234
//    123
//    12
//    1

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
        pattern2(5);
    }


    public static void pattern(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n-i; j++){
                System.out.print(j+1);
            }
        }
    }

    public static void pattern2(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
        }
    }
}
