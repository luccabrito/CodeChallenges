package Beecrowd;

import java.util.Scanner;

public class URI1234 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        while (sc1.hasNext()) {
            System.out.println(dancingSentence(sc1.nextLine()));
        }
    }

    private static String dancingSentence(String texto) {
        boolean maiuscula = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isAlphabetic(texto.charAt(i))) {
                if (maiuscula) {
                    sb.append(Character.toUpperCase(texto.charAt(i)));
                    maiuscula =! maiuscula;
                } else {
                    sb.append(Character.toLowerCase(texto.charAt(i)));
                    maiuscula =! maiuscula;
                }
            }
            else {
                sb.append(texto.charAt(i));
            }
        }
        return sb.toString();
    }
}
