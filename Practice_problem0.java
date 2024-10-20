import  java.util.Scanner;
/* Write a program to calculate percentage of a given students in CBSE board exam. his marks from 5 subjects must be taken as input from the keyboard.*/
/**
 * Practice_problem0.1
 */
public class Practice_problem0{

  public static void main(String[] args) {
     System.out.println("Take input from the user");
     Scanner sc = new Scanner(System.in);
     System.out.println("Hindi");
     int Hindi = sc.nextByte();
     System.out.println("English");
     int English = sc.nextByte();
     System.out.println("Maths");
     int Maths = sc.nextByte();
     System.out.println("Scince");
     int Scince = sc.nextByte();
     System.out.println("SST");
     int SST = sc.nextByte();
     int sum = ( Hindi + English + Maths + Scince +  SST );
     System.out.println("Total marks:" + sum);
     float multi = (sum*100);
     float per = (multi/500);
     System.out.println("The percentage of the student is:" + per + "%");
  }  
}