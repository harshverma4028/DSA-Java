import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String category = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(category);
    }
}
