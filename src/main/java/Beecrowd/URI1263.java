package Beecrowd;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class URI1263 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        while (sc1.hasNext()) {
            String texto = sc1.nextLine();
            String textoLowerCase = texto.toLowerCase();
            String[] arrayPalavras = textoLowerCase.split(" ");
            List<String> listaPalavras = Arrays.asList(arrayPalavras);
            int aliteracoes = 0;
            boolean achou = false;
            for (int i = 0; i < listaPalavras.size() - 1; i++) {
                char letraInicial = listaPalavras.get(i).charAt(0);
                char letraInicialProxima = listaPalavras.get(i + 1).charAt(0);
                if (letraInicialProxima == letraInicial && achou == false) {
                    aliteracoes++;
                    achou = true;
                } else if (letraInicial != letraInicialProxima) {
                    achou = false;
                }
            }
            System.out.println(aliteracoes);
        }
    }
}
