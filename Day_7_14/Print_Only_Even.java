package Day_7_14;

import java.util.Scanner;

public class Print_Only_Even {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
