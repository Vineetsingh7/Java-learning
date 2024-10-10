import  java.util.Scanner;
/**
 * Practice_problem.2
 */
public class Practice_2problem {
    public static void main(String[] args) {
        System.out.println("Take input from the user");
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your Fist number");
        int First = sc.nextInt();
        System.out.println("Enter your second number");
        int second = sc.nextInt();
        System.out.println("Enter your third number");
        int third = sc.nextInt();
        int sum = First + second + third ;
        System.out.println(sum);
    }
}