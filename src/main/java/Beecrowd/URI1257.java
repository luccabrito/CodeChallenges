package Beecrowd;

import java.util.Scanner;

public class URI1257 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int totalCasos = sc1.nextInt();
        sc1.nextLine();
        int total = 0;
        for (int a = 0; a < totalCasos; a++) {
            int numeroLinhas = sc1.nextInt();
            sc1.nextLine();
            for (int i = 0; i < numeroLinhas; i++) {
                String texto = sc1.nextLine();
                for (int k = 0; k < texto.length(); k++) {
                    int valor = texto.charAt(k) - 65;
                    total = total + i;
                    total = total + k;
                    total = total + valor;
                }
            }
            System.out.println(total);
            total = 0;
        }
    }
}
