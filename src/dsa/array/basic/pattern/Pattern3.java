package dsa.array.basic.pattern;

//1
//22
//333
//4444
//55555

public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < i+1; j ++){
                System.out.print(i+1);
            }
        }
    }

}
