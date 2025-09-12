def calcular_binario(decimal):
    binarios= []

    while decimal!=0:
        resto = decimal % 2
        binarios.append(resto)
        decimal = decimal // 2

    binario_invertido = binarios[::-1]
    return "".join(map(str, binario_invertido))

def main():

    decimal = int(input("Introduzca un número decimal:"))
    binario = calcular_binario(decimal)
    print(binario)

if __name__ == "__main__":
    main()