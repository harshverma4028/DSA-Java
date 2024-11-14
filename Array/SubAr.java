package Array;

public class SubAr {
    public static void printSubarrysum(int number[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        // calculate prefix arra

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0;i<number.length;i++){    
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currSum= start==0 ? prefix[end]: prefix[j]-prefix[i-1];   
                // for(int k=start;k<=end;k++){
                //     currSum+=number[k];  
                // } 
                // System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                    
                }               
            }
        }

        System.out.println("max sum : "+maxSum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printSubarrysum(number);
    }
}
