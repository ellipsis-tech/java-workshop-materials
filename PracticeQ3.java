public class PracticeQ3 {
    public static void main(String[] args) {
        Person myPerson = new Person("Bob", 170, 79);
        myPerson.greet();
        System.out.println("BMI: " + myPerson.calculateBmi());
    }
}

class Person {
    
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public void greet() {
        System.out.println("Hello! My name is " + this.name);
    }

    public double calculateBmi() {
        double metresHeight = (double) height / 100;
        double bmi = weight / (metresHeight * metresHeight);
        return bmi;
    }

}
