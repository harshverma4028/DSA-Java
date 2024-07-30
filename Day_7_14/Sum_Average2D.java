package Day_7_14;

public class Sum_Average2D {
    public static void main(String[] args) {
        int[][] numbers ={{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15}};
        int sum=0;
        int count=0;
     
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                sum+=numbers[i][j];
                count++;
            }
        }
        System.out.println("Sum of 2D Array: "+sum);
        System.out.println("Average of 2D Array: "+(sum/count));
    }
}
