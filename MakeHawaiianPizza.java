public class MakeHawaiianPizza {
    public static void main(String[] args) {
        Pizza piz = new HawaiianPizza(10);
        System.out.println(piz);
        System.out.println("Area of Pizza: " + piz.getPizzaArea());
    }
}
