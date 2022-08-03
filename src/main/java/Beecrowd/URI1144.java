package Beecrowd;

import java.util.Scanner;

public class URI1144 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int totalVezes = sc1.nextInt();
        boolean entrada = true;
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(a + " " + b + " " + c);
        for (int i = 1; i < totalVezes * 2; i++) {
            if (entrada) {
                b = b + 1;
                c = c + 1;
                System.out.println(a + " " + b + " " + c);
                entrada =! entrada;
            } else {
                a = a + 1;
                b = b + i;
                c = a * b;
                System.out.println(a + " " + b + " " + c);
                entrada =! entrada;
            }
        }
    }
}
