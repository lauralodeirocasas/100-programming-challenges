import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduzca el número decimal: ");
        int decimal = leerInt();
        String binario = calcularBinario(decimal);
        System.out.println(binario);
    }

    private static int leerInt() {
        return new Scanner(System.in).nextInt();
    }

    private static String calcularBinario(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> pila = new Stack<>();

        while(decimal!=0){
            int resto = decimal % 2;
            pila.push(resto);
            decimal= decimal / 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()) {
            binario.append(pila.pop());
        }

        return binario.toString();

    }
}
