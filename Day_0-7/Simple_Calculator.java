import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number1 : ");
      int num1 = input.nextInt();
      System.out.println("Enter the number2 : ");
      int num2 = input.nextInt();
      System.out.println("Enter the opcode ");
      String opcode = input.next();
      int result;
      switch (opcode) {
          case "+":
              result = num1 + num2;
              break;
          case "-":
              result = num1 - num2;
              break;
          case "*":
              result = num1 * num2;
              break;
          case "/":
              result = num1 / num2;
              break;
          case "%":
              result = num1 % num2;
              break;
          default:
              result = -1;
              break;
      }
      System.out.println(result);      
 
     }
    }
}
