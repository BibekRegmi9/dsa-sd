package dsa.array.basic.pattern;

//1
//12
//123
//1234
//12345


public class Pattern2 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("");
            for(int j = 0; j < i+1; j++){
                System.out.print(j+1);
            }
        }
    }

}
