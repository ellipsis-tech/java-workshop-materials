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

        System.out.println("COMPARING@!@!!!");
        
        // Compare the names first
        int diff = this.name.compareTo(o.name);
        
        // If the names are the same, then compare the weight
        if (diff != 0) {
            // The dogs are already not the same name
            return diff;
        }

        // Bob (10kg)
        // Bob (20kg)

        return this.weight - o.weight;

    }
}
