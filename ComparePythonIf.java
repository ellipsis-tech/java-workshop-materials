import java.util.Scanner;

public class ComparePythonIf {
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number == 5) {
            System.out.println("Number is 5!");
        } else if (number > 5) {
            System.out.println("Number is more than 5!");
        } else {
            System.out.println("Number is less than 5!");
        }

    }
}