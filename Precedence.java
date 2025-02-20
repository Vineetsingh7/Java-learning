public class Precedence {
    public static void main(String[] args) {
        int A = 5*5 -9 +2;
        /*  =25 -9 +2
         *  =16 + 2
            =18  */
        System.out.println(A);
        /* Precedence of Operators */
        int B = 60/5 -4*9;
         // =12 -4*9
          //  = 12 - 36
          // = -24
          /* Associativity of Operators */
          System.out.println(B);
    }
}
