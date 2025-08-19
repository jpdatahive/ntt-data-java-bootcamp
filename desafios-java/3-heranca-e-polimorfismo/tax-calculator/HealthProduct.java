public class HealthProduct extends Product {
    public HealthProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        // Imposto de 1.5%
        return getPrice() * 0.015;
    }
}
