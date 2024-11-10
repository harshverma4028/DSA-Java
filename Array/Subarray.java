package Array;

public class Subarray {
    public static void printSubarry(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i+1;j<number.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(number[k]+" ");   
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        printSubarry(number);
    }
}
