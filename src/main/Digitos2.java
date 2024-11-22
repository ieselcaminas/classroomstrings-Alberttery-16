public class Digitos2 {
    public static boolean esNumero (String cadena) {
        int contador = 0;
        boolean esNumero;
        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;
            for (int j = 0; j < palabras[i].length(); j++) {
                if (Character.isDigit(palabras[i].charAt(i))) {
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) contador++;
        }
        return contador == palabras.length;
    }

    public static void main(String[] args) {
        System.out.println(esNumero("123"));
    }
}
