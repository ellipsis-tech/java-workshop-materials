public class HawaiianPizza extends Pizza {

    public HawaiianPizza(double sizeDiameter) {
        super(sizeDiameter);
    }

    @Override
    public String toString() {
        return "Hawaiian " + super.toString();
    }
    
}
