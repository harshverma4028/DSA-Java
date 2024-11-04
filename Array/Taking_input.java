package Array;
import java.util.*;

public class Taking_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int number[]=new int[size];

        System.out.println("Enter the elements of the array: ");
 
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();

        }

        System.out.println("the elemets of the array are:");
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
