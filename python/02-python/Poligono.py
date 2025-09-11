from abc import ABC, abstractmethod

class Poligono(ABC):
    @abstractmethod
    def calcular_area(self):
        pass