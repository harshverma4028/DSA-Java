package Day_7_14;
import java.util.*;

public class Pass_Checker {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);

    String password = "";
    do{
        System.out.println("Enter the password: ");
        password = sc.nextLine();
    }while(password.length() < 8);
    System.out.println("Password is valid");
}
}
