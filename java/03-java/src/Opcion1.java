public class Opcion1 {
    public static void main(String[] args) {
        String original = "Hola Mundo";
        String reversa = "";

        for(int i = original.length()-1;i>=0;i--){
            reversa+=original.charAt(i);
        }

        System.out.println(reversa);
    }
}
