public class Opcion3 {

    public static String invertirCadena(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + invertirCadena(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String original = "Hola Mundo";
        System.out.println(invertirCadena(original)); // aloh
    }
}
