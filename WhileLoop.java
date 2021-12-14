import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double sum = 0;
        
        while( !(num < 0) ) {
            System.out.print("Enter a double: ");
            num = sc.nextDouble();
            sum += num;
            if (num >= 0) {
                System.out.println(sum);
            }
        }
        
    }
}