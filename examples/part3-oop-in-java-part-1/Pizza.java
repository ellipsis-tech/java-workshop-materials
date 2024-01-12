public class Pizza extends Object {

    private double sizeDiameter;

    public Pizza(double sizeDiameter) {
        this.sizeDiameter = sizeDiameter;
    }

    public String toString() {
        return String.format("Pizza, with size %.2f inch", sizeDiameter);
    }

    public double getPizzaArea() {
        double radius = sizeDiameter / 2;
        return Math.PI * radius;
    }

}
