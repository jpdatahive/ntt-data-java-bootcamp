public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract double getTaxValue();

    // Método concreto que usa o resultado do método abstrato
    public double getFinalPrice() {
        return getPrice() + getTaxValue();
    }
}
