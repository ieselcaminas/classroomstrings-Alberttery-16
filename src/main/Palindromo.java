public class Palindromo {
    public static boolean palindromo(String palindromo) {
        for (int i = 0; i < palindromo.length()/2; i++) {
            if (palindromo.charAt(i) != palindromo.charAt(palindromo.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String palindromo = "abas";
        if(palindromo(palindromo)){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }


    }
}
