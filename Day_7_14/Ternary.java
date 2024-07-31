package Day_7_14;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println("The number is: "+result);
        
    }
}
