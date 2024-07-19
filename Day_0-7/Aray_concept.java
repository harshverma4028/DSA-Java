class Array_concept{
    public static void main(String[] args){
        System.out.println("Array Concept");

        // Array Declaration
        int  [] myArray={1,2,3,4,5,6,7,8,9,10};
 
        //Array length
        System.out.println("Array Length: "+myArray.length);

        //Accessing Array Elements
        System.out.println(myArray[5]);



        //Array Initialization
        int [] myArray1=new int[10];
        int a=myArray1[0]=10;
        int b=myArray1[1]=20;
        int c=myArray1[2]=30;
        int d=myArray1[3]=40;
        int e=myArray1[4]=50;
        
        System.out.println(a);
    }
}