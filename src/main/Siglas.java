public class Siglas {
    public static String siglas(String texto) {
        return texto.replaceAll("[abcdefghijklmnopqrstuvwxyz ]", "");
    }
    public static void main(String[] args) {

        String textoOriginal = "Esto Es Una Frase ";
        String textoModificado = siglas(textoOriginal);

        System.out.println("Organización: " + textoOriginal);
        System.out.println("Siglas: " + textoModificado);
    }
}
