package dsa.array.basic.pattern;

//1
//10
//101
//1010
//10101

public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
        pattern6Advance(5);
    }

    public static void pattern(int n){
        for(int i = 0 ; i  < n; i++){
            String pattern = "";
            int togglee = 1;
            for(int j = 0; j < i+1; j++){
                pattern += togglee;

                //switch the toggle
                if(togglee == 1){
                    togglee = 0;
                } else {
                    togglee = 1;
                }
            }
            System.out.println(pattern);
        }
    }


    public static void pattern6Advance(int n){
        int togglee = 1;
        for(int i = 0 ; i  < n; i++){
            String pattern = "";

            for(int j = 0; j < i+1; j++){
                pattern += togglee;

                //switch the toggle
                if(togglee == 1){
                    togglee = 0;
                } else {
                    togglee = 1;
                }
            }
            System.out.println(pattern);
        }
    }
}
