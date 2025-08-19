public class FoodProduct extends Product {
    public FoodProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        // Imposto de 1%
        return getPrice() * 0.01;
    }
}
