import java.util.Arrays;

public class Sum_And_Average{
    public static void main(String[] args) {
        int arras[]={2,5,7,5,2,5};
        int sum=0;
   
        //sum of array 
        for(int i=0;i<arras.length;i++){
            sum+=arras[i];
        }

        System.out.println("The Array is :"+Arrays.toString(arras));
        System.out.println("The sum of Array is : "+sum);

        //Average of arary 
        int length=arras.length;
        double average=sum/length;
        System.out.println("the average of the Array is :"+average);
    }
}
