import java.util.ArrayList;
import java.util.Collections;

public class PracticeQ4 {
    public static void main(String[] args) {

        ArrayList<Dog> dogsStorage = new ArrayList<Dog>();
        dogsStorage.add(new Dog("Sparky", 10));
        dogsStorage.add(new Dog("Sparky", 11));
        dogsStorage.add(new Dog("A", 11));
        dogsStorage.add(new Dog("B", 11));
        dogsStorage.add(new Dog("C", 11));
        dogsStorage.add(new Dog("Bubble", 5));
        dogsStorage.add(new Dog("Sparky", 9));
        dogsStorage.add(new Dog("Cherry", 20));
        dogsStorage.add(new Dog("Rocks", 8));
        dogsStorage.add(new Dog("Rocks", 4));
        
        Collections.sort(dogsStorage);
        
        System.out.println(dogsStorage);
    }
}
