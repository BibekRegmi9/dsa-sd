package dsa.array.basic.pattern;

//     *
//    **
//   ***
//  ****
// *****

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i = 0; i < n; i ++){
            String space = "";
            String pattern = "";
            for(int j = 0; j < n-(i+1); j++){
                space += " ";
            }
            System.out.print(space);

            for(int k = 0; k < i+1; k++){
                pattern += "*";
            }
            System.out.println(pattern);
        }
    }
}
