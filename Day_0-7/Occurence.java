import java.util.Arrays;

public class Occurence {
    static void getOccurence(int[] arr, int n){

        Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=i+1;j<arr.length-1;j++){
            if (arr[i]==arr[j]) 
                count++;
            else break; 
            
        }
        System.out.println("The number "+arr[i]+" occurs "+count+" times");
        i+=(count-1);
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,2,8,8,};
        getOccurence(arr, 5);
    }
}
