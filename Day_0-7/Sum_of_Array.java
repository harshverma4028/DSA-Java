import java.util.Arrays;

public class Sum_of_Array {
    public static void main(String[] args) {
        int arras[]={2,5,7,5,2,5};
        int sum=0;

        for(int i=0;i<arras.length;i++){
            sum+=arras[i];
        }

        System.out.println("The Array is :"+Arrays.toString(arras));
        System.out.println("The sum of Array is : "+sum);
    }
}
