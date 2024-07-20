import java.util.*;

public class Input_Array {
    public static void main(String args[]){
        System.out.println("Enter the length of the array: ");

        //Array Declaration
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] myArray3=new int[size];
        
        
        
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<myArray3.length;i++){
            myArray3[i]=sc.nextInt();

        }
       
        System.out.println("Elements of arrays are :");
        for(int i=0;i<myArray3.length;i++){
            System.out.println(myArray3[i]);
        }


        //Searching in array
        System.out.println("Enter the element to be searched: ");
        int search=sc.nextInt();
        for(int i=0;i<myArray3.length;i++){
            if(myArray3[i]==search){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
    }
}
