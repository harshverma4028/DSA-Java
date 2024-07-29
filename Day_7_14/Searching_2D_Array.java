package Day_7_14;
import java.util.Scanner;

public class Searching_2D_Array {
    public static void main(String args[]){
    int [][] numbers={{1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14,15}};
     
                      System.out.println("2D Array Elements");
                      for(int i=0;i<3;i++){
                          for(int j=0;j<5;j++){
                              System.out.print(numbers[i][j]+" ");
                          }
                          System.out.println();
                      }
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter the number to search");
                        int search=sc.nextInt();

                        boolean flag=false;
                        for(int i=0;i<3;i++){
                            for(int j=0;j<5;j++){
                                if(numbers[i][j]==search){
                                    System.out.println("Number found at index: "+i+" "+j);
                                    flag=true;
                                    break;
                                }
                            }
                        }
                        if(flag==false){
                            System.out.println("Number not found");
                        }
    }
}
