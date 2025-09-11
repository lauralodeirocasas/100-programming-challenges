public class Cuadrado extends Poligono{
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
