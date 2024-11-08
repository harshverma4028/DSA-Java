package Array;


public class Pair {
    public static void MakePair(int number[]){

        int tp=0;

        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")"); 
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair: "+tp);
    }
    
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        MakePair(number);
        
    }
}
