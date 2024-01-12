import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int triangleSize = sc.nextInt();

        for (int i = triangleSize; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }    

    }
}
