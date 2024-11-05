package Array;

public class Update {
    public static void update(int arr[]){
        for (int i=0;i<arr.length;i++)
{
            arr[i]=arr[i]+1;
}    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
