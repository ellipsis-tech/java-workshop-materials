public class Pizza {
    private String flavour;
    private double sizeDiameter;

    public Pizza(String flavour, double sizeDiameter) {
        this.flavour = flavour;
        this.sizeDiameter = sizeDiameter;
    }

    public String toString() {
        return String.format("%s Pizza, with size %.2f inch", flavour, sizeDiameter);
    }

    public double getPizzaArea() {
        double radius = sizeDiameter / 2;
        return Math.PI * radius;
    }
}
