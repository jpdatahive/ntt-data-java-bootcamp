public class Main {
    public static void main(String[] args) {
        // Instanciando as figuras
        Shape square = new Square(10.0);
        Shape rectangle = new Rectangle(8.0, 5.0);
        Shape circle = new Circle(4.0);

        // Criando um array de Shapes para demonstrar o polimorfismo
        Shape[] shapes = {square, rectangle, circle};

        System.out.println("--- Calculando a Área das Figuras Geométricas ---");

        // Iterando sobre o array e chamando o método getArea() de cada objeto
        // O método correto é chamado para cada tipo de figura (polimorfismo)
        for (Shape shape : shapes) {
            // getClass().getSimpleName() retorna o nome da classe (ex: "Square")
            System.out.printf("Área do %s: %.2f
", shape.getClass().getSimpleName(), shape.getArea());
        }
    }
}
