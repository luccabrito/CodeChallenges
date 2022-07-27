package Beecrowd;

import java.util.Scanner;

public class URI1253 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int totalVezes = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < totalVezes; i++) {
            sc1.nextLine();
            String texto = sc1.nextLine();
            int valorDeslocamento = sc1.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < texto.length(); j++) {
                int caracter = texto.charAt(j);
                int novoCaracter;
                if (caracter - valorDeslocamento < 65) {
                    novoCaracter = caracter + 26 - valorDeslocamento;
                } else {
                    novoCaracter = caracter - valorDeslocamento;
                }
                char ch = (char) novoCaracter;
                sb.append(ch);
            }
            System.out.println(sb.toString());
        }
    }
}
