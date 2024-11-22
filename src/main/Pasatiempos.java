public class Pasatiempos {
    public static String crearPasatiempo(String texto) {
        return texto.replaceAll("[aeiouAEIOU]", ".");
    }

    public static void main(String[] args) {

        String textoOriginal = "JHfkfUYFuyfYujhuyfFLIFFfiFAEFAFGaefaeAEfAEF";
        String textoModificado = crearPasatiempo(textoOriginal);

        System.out.println("Frase Real: " + textoOriginal);
        System.out.println("Texto sin Vocales: " + textoModificado);
    }
}
