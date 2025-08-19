public class CultureProduct extends Product {
    public CultureProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        // Imposto de 4%
        return getPrice() * 0.04;
    }
}
