public class ClothingProduct extends Product {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        // Imposto de 2.5%
        return getPrice() * 0.025;
    }
}
