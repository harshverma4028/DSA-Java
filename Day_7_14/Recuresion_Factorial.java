package Day_7_14;
import java.util.*;

public class Recuresion_Factorial {

    public static int Example(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Example(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = Example(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}
