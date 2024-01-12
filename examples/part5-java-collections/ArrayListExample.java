import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("One");
        al.add("Three");
        al.add("Five");

        al.remove(1);

        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.get(2));
    }
}