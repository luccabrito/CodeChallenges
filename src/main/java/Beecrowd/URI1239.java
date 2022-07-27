package Beecrowd;

import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            System.out.println(tagHTML(leitor.nextLine()));
        }
    }

    private static String tagHTML(String texto) {
        boolean entradaItalico = true;
        boolean entradaNegrito = true;
        StringBuilder frase = new StringBuilder(texto);
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == '_') {
                if (entradaItalico) {
                    frase.replace(i, i+1, "<i>");
                } else {
                    frase.replace(i, i+1,"</i>");
                }
                entradaItalico = !entradaItalico;
            }
            if (c == '*') {
                if (entradaNegrito) {
                    frase.replace(i, i+1, "<b>");
                } else {
                    frase.replace(i, i+1, "</b>");
                }
                entradaNegrito = !entradaNegrito;
            }
        }
        return frase.toString();
    }
}