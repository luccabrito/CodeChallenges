package Beecrowd;

import java.util.Scanner;

public class URI3055 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int nota1 = sc1.nextInt();
        int media = sc1.nextInt();
        int notaFaltando = media * 2 - nota1;
        System.out.println(notaFaltando);
    }
}
