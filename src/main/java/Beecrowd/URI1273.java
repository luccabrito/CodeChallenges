package Beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        boolean rodando = true;
        boolean first = true;
        while (rodando) {
            int numeroStrings = sc1.nextInt();
            if (numeroStrings == 0) {
                rodando = false;
                break;
            }
            if (first == false) {
                System.out.println();
            }
            int tamanhoMaiorTexto = 0;
            List<String> palavras = new ArrayList<>();
            for (int i = 0; i < numeroStrings; i++) {
                String texto = sc1.next();
                palavras.add(texto);
                int tamanhoTexto = texto.length();
                if (tamanhoTexto > tamanhoMaiorTexto) {
                    tamanhoMaiorTexto = tamanhoTexto;
                }
            }

            for (String palavra : palavras) {
                if (palavra.length() != tamanhoMaiorTexto) {
                    StringBuilder sb = new StringBuilder(palavra);
                    for (int i = 0; i < tamanhoMaiorTexto - palavra.length(); i++) {
                        sb.insert(0, ' ');
                    }
                    System.out.println(sb.toString());
                } else {
                    System.out.println(palavra);
                }
            }
            first = false;
        }
    }
}
