package Beecrowd;

import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int totalPalavras = sc1.nextInt();
        for (int j = 0; j < totalPalavras; j++) {
            String texto = sc1.nextLine();
            while (texto.isEmpty()) {
                texto = sc1.nextLine();
            }
            String metade1 = texto.substring(0, texto.length()/2);
            String metade2 = texto.substring(texto.length()/2);
            StringBuilder sb = new StringBuilder();
            for (int i = metade1.length() - 1; i >= 0; i--) {
                sb.append(metade1.charAt(i));
            }
            for (int i = metade2.length() - 1; i >= 0; i--) {
                sb.append(metade2.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
