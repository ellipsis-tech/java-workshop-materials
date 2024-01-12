public class BasicForLoop {
    public static void main(String[] args) {

        int[] someNumbers = {1,2,3,4,5};
        int sumNumbers = 0;

        // Using a for-loop, sum the numbers in someNumbers array
        for (int i = 0; i < someNumbers.length; i++) {
            sumNumbers += someNumbers[i];
        }

        System.out.printf("Sum of someNumbers: %d\n", sumNumbers);
    }
}
