import java.io.*;
import java.util.*;

public class JavaLoops2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int sum = a;
            for (int j = 0; j < n; ++j){
                sum += (Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
