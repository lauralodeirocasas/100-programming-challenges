from Triangulo import Triangulo
from Rectangulo import Rectangulo
from Cuadrado import Cuadrado

def main():
    triangulo = Triangulo(10,7)
    cuadrado = Cuadrado(10)
    rectangulo = Rectangulo(10,5)

    print("Área del triángulo: ", triangulo.calcular_area())
    print("Área del cuadrado: ", cuadrado.calcular_area())
    print("Área del rectangulo: ", rectangulo.calcular_area())


if __name__ == "__main__":
    main()