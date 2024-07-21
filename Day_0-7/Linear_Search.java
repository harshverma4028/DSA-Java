import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();
        
        boolean flag=false;

        for(int i=0;i<a.length;i++){
            if(x==a[i]) {
                System.out.println("Element found at Index: "+i);
                flag=true;
                break;
            }
        }

        if(flag==false){
            System.out.println("Element not found");
        }

    }
}
