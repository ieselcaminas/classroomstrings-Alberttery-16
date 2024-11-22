public class Alfabetica {
    public static boolean esAlfabetica(String cadena) {
        for (int i = 0; i < cadena.length() - 1; i++) {
            char a = cadena.charAt(i);
            char b = cadena.charAt(i + 1);
            if (a > b) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esAlfabetica("ab"));
    }
}
