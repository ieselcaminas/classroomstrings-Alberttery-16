public class SumarBinario {
    public static String sumarBinario(String num1, String num2) {
        int maximo = Math.max(num1.length(), num2.length());
        String res = "";
        String extra = "";

        num1 = String.format("%" + maximo + "s", num1).replace(' ', '0');
        num2 = String.format("%" + maximo + "s", num2).replace(' ', '0');

        for (int i = maximo - 1; i >= 0; i--) {
            int digitoA = Integer.parseInt("" + num1.charAt(i));
            int digitoB = Integer.parseInt("" + num2.charAt(i));

            if (digitoA == 1 && digitoB == 1) {
                res = "0" + res;
                extra = "1";

            } else if (digitoA == 0 && digitoB == 0) {
                res = extra + res;
                extra = "";

            } else {
                res = 1 + res;
            }
        }

        if (extra.equals("1")) {
            res = "1" + res;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumarBinario("101", "1001"));

    }
}
