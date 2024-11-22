public class Invertida {
    public static String invertir(String original) {
        String[] palabras = original.split(" ");
        String invertido = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            invertido = invertido + palabras[i] + " ";
        }

        return invertido;
    }
    public static void main(String[] args) {
        System.out.println(invertir("Esto es una frase"));
    }
}
