public class Triangulo extends Poligono{
    double base;
    double altura;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
