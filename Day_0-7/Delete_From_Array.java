import java.util.*;

public class Delete_From_Array {
    public static void main(String[] args) {
        int arrd[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to delete: ");
        int x = sc.nextInt();
        sc.close();

        // Check if the element exists in the array
        boolean found = false;
        for (int i : arrd) {
            if (i == x) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
            return;
        }

        int newarr[] = new int[arrd.length - 1];
        int k = 0;
        for (int i = 0; i < arrd.length; i++) {
            if (x != arrd[i]) {
                newarr[k] = arrd[i];
                k++;
            }
        }

        System.out.println("Old Array is: " + Arrays.toString(arrd));
        System.out.println("New Array is: " + Arrays.toString(newarr));
    }
}
