package Day_7_14;
import java.util.Scanner;

public class Multiplication {
    
    public static void multiply(int a, int b) {
        Scanner sc = new Scanner(System.in); 
         System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }
   public static void main(String[] args) {
         multiply(0, 0);
   }
}
