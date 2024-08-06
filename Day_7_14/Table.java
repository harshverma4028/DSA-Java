package Day_7_14;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        table(0);
        
    }

    public static void table(int num){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + " X "+i+" = "+num*i);
        }

    }
}
