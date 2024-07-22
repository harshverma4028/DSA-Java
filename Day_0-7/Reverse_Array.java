public class Reverse_Array {

    static void  reverse(int arr[]){
        int i=0;
        int j=arr.length-1;

        while (i<j) {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;  
            j--;
        }
        System.out.println("Array after reversing: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array Before reversing: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        
    }
}
