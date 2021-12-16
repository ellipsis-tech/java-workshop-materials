import java.util.*;

public class Generics{
   public static void main(String[] args) {

       // The defined list below could hold object of any type
       List names = new ArrayList();
       names.add("bob");
       names.add("mary");

       // We would have to explicitly cast in future usages
       String someName = (String) names.get(0);

       // Instead, create a 'contract' with a diamond operator '<>'
       List<String> betterNames = new ArrayList<>();
       betterNames.add("bob");
       betterNames.add("mary");

       // The output will already be a String
       String someBetterName = betterNames.get(0);
   }
}
