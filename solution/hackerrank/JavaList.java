import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int initialCount = Integer.parseInt(sc.nextLine());
        String initialElems = sc.nextLine();
        String[] numbersStrArr = initialElems.split(" ");
        for(int i = 0; i < numbersStrArr.length; ++i){ // or can use a for-each loop
            ls.add(Integer.parseInt(numbersStrArr[i])); 
        }
        int queries = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < queries; ++i){
            String queryType = sc.nextLine();
            switch (queryType){
                case "Insert":
                    String insertParamsStr = sc.nextLine(); 
                    String[] insertParams = insertParamsStr.split(" ");
                    // insertParams[0] and [1] correspond to x and y respectively.
                    // so we insert y at index x.
                    int indexToInsert = Integer.parseInt(insertParams[0]);
                    // Check if integer to add is to the end of the array
                    if (indexToInsert >= ls.size()){
                        ls.add(Integer.parseInt(insertParams[1]));
                    } else {
                        ls.add(indexToInsert, Integer.parseInt(insertParams[1]));
                    }
                    break;
                case "Delete":
                    int deleteIndex = Integer.parseInt(sc.nextLine());
                    ls.remove(deleteIndex);
                    break;
                default:
                    System.out.println("Should not reach here!");
                    break;
            }
        }
        for(int item : ls){ // for each loop
            System.out.print(item + " ");
        }
    }
}
