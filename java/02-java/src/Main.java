import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Poligono triangulo = new Triangulo(5, 10);
        Poligono rectangulo = new Rectangulo(4, 6);
        Poligono cuadrado = new Cuadrado(4);

        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
    }

}
