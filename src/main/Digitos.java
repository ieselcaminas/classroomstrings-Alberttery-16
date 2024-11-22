public class Digitos {
    public static int digitos(String cadena) {
        int digitos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                digitos++;
            }
        }
        return digitos;
    }
    public static void main(String[] args) {
        System.out.println(digitos("123 al 343"));
    }
}
