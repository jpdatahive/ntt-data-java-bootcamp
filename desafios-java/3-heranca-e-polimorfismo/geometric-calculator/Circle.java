public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Usando a constante Math.PI para o cálculo
        return Math.PI * this.radius * this.radius;
    }
}
