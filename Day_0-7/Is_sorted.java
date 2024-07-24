public class Is_sorted {

    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if (arr[i-1]<arr[i]) {
                return false;
            }
        }  return true;  
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,};
        System.out.println(isSorted(arr));
    }
}
