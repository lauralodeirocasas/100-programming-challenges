from Poligono import Poligono

class Cuadrado(Poligono):

    def __init__(self,lado):
        self.lado = lado
    def calcular_area(self):
        return self.lado * self.lado