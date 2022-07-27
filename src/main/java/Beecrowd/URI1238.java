package Beecrowd;

import java.util.Scanner;

public class URI1238 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int numeroVezes = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < numeroVezes; i++) {
            System.out.println(combinadorStrings(sc1.nextLine()));
        }
    }

    private static String combinadorStrings(String texto) {
        String[] textos = texto.split(" ");
        String palavra1 = textos[0];
        String palavra2 = textos[1];
        StringBuilder sb = new StringBuilder();
        if (palavra1.length() > palavra2.length()) {
            for (int i = 0; i < palavra2.length(); i++) {
                sb.append(palavra1.charAt(i));
                sb.append(palavra2.charAt(i));
            }
            String restoPalavra = palavra1.substring(palavra2.length());
            sb.append(restoPalavra);
        } else if (palavra2.length() > palavra1.length())  {
            for (int i = 0; i < palavra1.length(); i++) {
                sb.append(palavra1.charAt(i));
                sb.append(palavra2.charAt(i));
            }
            String restoPalavra = palavra2.substring(palavra1.length());
            sb.append(restoPalavra);
        } else {
            for (int i = 0; i < palavra1.length(); i++) {
                sb.append(palavra1.charAt(i));
                sb.append(palavra2.charAt(i));
            }
        }
        return sb.toString();
    }
}