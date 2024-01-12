import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                // The number starts 15 characters from the left
                // Find the amount of whitespace to print after s1
                int amountOfWhitespace = 15 - s1.length();
                for (int j = 0; j < amountOfWhitespace; ++j){
                    System.out.print(" ");
                }
                
                String xStr = Integer.toString(x);
                int padLength = 3 - xStr.length();
                for (int j = 0; j < padLength; ++j){
                    System.out.print("0");
                }
                
                System.out.println(xStr);
            }
            System.out.println("================================");

    }
}
