package Beecrowd;

import java.util.Scanner;

public class URI2006 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int respostaCerta = sc1.nextInt();
        sc1.nextLine();
        int pessoasComRespostaCerta = 0;
        for (int i = 0; i < 5; i++) {
            int resposta = sc1.nextInt();
            if (resposta == respostaCerta) {
                pessoasComRespostaCerta++;
            }
        }
        System.out.println(pessoasComRespostaCerta);
    }
}
