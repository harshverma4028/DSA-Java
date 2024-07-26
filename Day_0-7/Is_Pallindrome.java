public class Is_Pallindrome {

    static void isPallindrome(int arr[],int n){
        //Initilazing the flag to true
        int flag=0;
        //Checking if the array is null
        for(int i=0;i<arr.length/2 && n!=0;i++){
            if (arr[i]!=arr[arr.length-i-1]) {
                flag=1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("The array is not a pallindrome");
        }else{
            System.out.println("The array is a pallindrome");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        isPallindrome(arr, arr.length);
    }

}
