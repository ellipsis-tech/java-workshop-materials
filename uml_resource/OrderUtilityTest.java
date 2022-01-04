import java.util.ArrayList;

public class OrderUtilityTest {
    public static void main(String[] args) {
        Order[] orders = new Order[4];

        Order t1 = new Order("Nintendo Plug");
        Order t2 = new Order("PearPhone");
        Order t3 = new CardOrder("Salted Egg Potato Chips", 10);
        Order t4 = new CardOrder("Abibas Slides", 2);

        orders[0] = t1;
        orders[1] = t2;
        orders[2] = t3;
        orders[3] = t4;

        System.out.println("Order 1: " + t1.calculateTotal());
        System.out.println("Order 2: " + t2.calculateTotal());
        System.out.println("Order 3: " + t3.calculateTotal());
        System.out.println("Order 4: " + t4.calculateTotal());

        System.out.println();
        System.out.println("Test 1:");
        System.out.println("Expected: 0.0");
        System.out.println("Actual  : " + OrderUtility.calculateAverageOrderTotal(null));

        System.out.println();
        System.out.println("Test 3:");
        System.out.println("Expected: 10.7625");
        System.out.println("Actual  : " + OrderUtility.calculateAverageOrderTotal(orders));
    }
}
