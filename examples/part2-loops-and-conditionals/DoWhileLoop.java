import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        String userinput;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Say something: ");
            userinput = sc.nextLine();
        } while (!userinput.equals("bye"));

    }
}
