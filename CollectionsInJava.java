import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Sally", 20));
        al.add(new Person("Ahmad", 23));

        Iterator<Person> iter = al.iterator();

        
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;  
    }

    public int getAge(){
        return age;
    }
}