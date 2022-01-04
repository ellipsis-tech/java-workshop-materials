public class Dog implements Comparable<Dog> {

    private String name;

    private int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }

    @Override
    public int compareTo(Dog o) {
        
        int diff = this.weight - o.weight;
        
        if (diff != 0) {
            return - diff;
        }

        return - this.name.compareTo(o.name);
    }
}
