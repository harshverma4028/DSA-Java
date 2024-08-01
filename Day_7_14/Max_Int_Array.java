package Day_7_14;
public class Max_Int_Array {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    
    static int max(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]) {
                max= arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Max Integer in Array"+max(null));
        
    }
}
