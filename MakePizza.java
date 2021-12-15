public class MakePizza {
    public static void main(String[] args) {

        // Creating the pizza
        Pizza myPizza = new Pizza("Hawaiian", 10);

        // Printing the pizza
        System.out.println(myPizza.toString());

        // Getting the area of the pizza
        System.out.print("My pizza has an area of: ");
        System.out.println(myPizza.getPizzaArea());
    }
}
