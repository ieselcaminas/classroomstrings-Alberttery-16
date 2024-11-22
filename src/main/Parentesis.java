public class Parentesis {
    public static boolean esParentizada(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' ) {
                contador++;
            }
            if (cadena.charAt(i) == ')'){
                contador--;
            }
            if (contador == -1){
                return false;
            }
        }
        return contador == 0;
    }
    public static void main(String[] args) {
        System.out.println(esParentizada("()fasdfas((eewe(()ewerwer))erwwerwrere)"));
        System.out.println(esParentizada("(()ewerwer)werwr))((ere"));
        System.out.println(esParentizada("()()()()()()()()()"));
        System.out.println(esParentizada("(.)(.)"));
        System.out.println(esParentizada("(())()"));
        System.out.println(esParentizada("(()ewerwer()werwr)werwr"));
    }
}
