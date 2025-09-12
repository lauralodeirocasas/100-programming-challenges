public class Opcion2 {
    public static void main(String[] args) {
        String original = "Hola Mundo";

        char [] originalChars = original.toCharArray();
        char [] reversaChars = new char[originalChars.length];

        for( int i = 0; i < originalChars.length;i++){
            reversaChars[i]=originalChars[originalChars.length-1-i];
        }

        System.out.println(new String(reversaChars));

    }
}
