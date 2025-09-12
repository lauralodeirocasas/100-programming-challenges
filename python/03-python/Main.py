def invertir_cadena(cadena):
    invertida = ""
    for i in range(len(cadena)-1,-1,-1):
        invertida+= cadena[i]

    return invertida


def main():
    print(invertir_cadena("Hola Mundo"))

if __name__ == "__main__":
    main()