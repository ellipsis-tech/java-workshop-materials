import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // Create a ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        int size = sc.nextInt();
        // Fill the 2D array
        for (int i = 0; i < size; ++i){
            ArrayList<Integer> ls = new ArrayList<>();
            int currListSize = sc.nextInt();
            for (int j = 0; j < currListSize; ++j){
                ls.add(sc.nextInt());
            }
            listOfLists.add(ls);
        }
        // Read in the number of queries
        int q = sc.nextInt();
        for (int i = 0; i < q; ++i){
            int row = sc.nextInt() - 1, col = sc.nextInt() - 1;
            if (row < 0 || row >= listOfLists.size()){
                System.out.println("ERROR!");
                continue;
            }
            List<Integer> targetList = listOfLists.get(row);
            if (col < 0 || col >= targetList.size()){
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(targetList.get(col));
        }
    }
}
