import java.util.Arrays;

public class AssignArr {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; // Fix the number of elements in the array 
        int[] arr2 = {0, 1, 2, 3, 4}; // Don't forget the semicolon
        int[] arr3 = new int[] {5, 6, 7, 8, 10000000};
        String[] arr4 = new String[5];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}