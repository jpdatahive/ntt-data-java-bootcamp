public class Main {
    public static void main(String[] args) {
        // Instanciando os produtos
        Product food = new FoodProduct("Arroz (1kg)", 25.00);
        Product health = new HealthProduct("Protetor Solar", 50.00);
        Product clothing = new ClothingProduct("Camiseta Básica", 80.00);
        Product culture = new CultureProduct("Livro de Java", 45.00);

        // Criando um array de produtos para demonstrar o polimorfismo
        Product[] products = {food, health, clothing, culture};

        System.out.println("--- Calculando Tributos e Preço Final dos Produtos ---");

        // Iterando sobre os produtos e exibindo as informações
        for (Product product : products) {
            System.out.printf(
                "Produto: %-15s | Preço Base: R$ %5.2f | Tributo: R$ %5.2f | Preço Final: R$ %5.2f\n",
                product.getName(),
                product.getPrice(),
                product.getTaxValue(),
                product.getFinalPrice()
            );
        }
    }
}
