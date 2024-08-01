package Day_7_14;

public class Max_Int_Array {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 99, 10};

    static int max(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Max_Int_Array instance = new Max_Int_Array();
        System.out.println("Max Integer in Array: " + max(instance.arr));
    }
}
