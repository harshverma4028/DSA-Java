import java.util.*;
public class Min_Max {
    public static void main(String args[]){
        System.out.println("Enter the length of the array: ");

        //Array Declaration
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] myArray3=new int[size];
        
        
            //taking input from user
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<myArray3.length;i++){
            myArray3[i]=sc.nextInt();

        }
             //Array Output
        System.out.println("Elements of arrays are :");
        for(int i=0;i<myArray3.length;i++){
            System.out.println(myArray3[i]);
        }


        //Searching in array
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<myArray3.length;i++){
            if(myArray3[i]>max){
                max=myArray3[i];
            }

            if(myArray3[i]<min){
                min=myArray3[i];
            }          
        }

        System.out.println("largest number is: "+max);
        System.out.println("smallest number is: "+min);
    }    
}
