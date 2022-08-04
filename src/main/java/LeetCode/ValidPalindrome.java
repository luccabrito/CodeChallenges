package LeetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
    public static boolean isPalindrome(String s) {
        String textoLowerCase = s.toLowerCase();
        StringBuilder textoAlfanumerico = new StringBuilder();
        for (int i = 0; i < textoLowerCase.length(); i++) {
            if (Character.isLetterOrDigit(textoLowerCase.charAt(i))) {
                textoAlfanumerico.append(textoLowerCase.charAt(i));
            }
        }
        int metadeTexto = textoAlfanumerico.length()/2;
        String segundaMetade;
        if (textoAlfanumerico.length() % 2 != 0) {
            segundaMetade = textoAlfanumerico.substring(metadeTexto + 1);
        } else {
            segundaMetade = textoAlfanumerico.substring(metadeTexto);
        }
        StringBuilder sb = new StringBuilder(segundaMetade);
        String segundaMetadeRevertida = sb.reverse().toString();
        String primeiraMetade = textoAlfanumerico.substring(0, metadeTexto);
        for (int i = 0; i < primeiraMetade.length(); i++) {
            if (primeiraMetade.charAt(i) != segundaMetadeRevertida.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
