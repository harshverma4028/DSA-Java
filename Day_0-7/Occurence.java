import java.util.Arrays;

public class Occurence {
    static void getOccurence(int[] arr){

        Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        int count=1;
        // if (i!=arr.length-1) {
            
        
        for(int j=i+1;j<arr.length-1;j++){
            if (arr[i]==arr[j]) 
                count++;
            else break; 
            
        }
    // }
        System.out.println("The number "+arr[i]+" occurs "+count+" times");
        i+=(count-1);
    }
}
    public static void main(String[] args) {
        int arr[]={2,3,3,3,2,2,2,1,3,2,1};
        getOccurence(arr);
    }
}
