public class Rectangulo extends Poligono{
    double base;
    double altura;

    public Rectangulo( double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
