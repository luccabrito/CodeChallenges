package CodinGame;

import java.util.*;
import java.io.*;
import java.math.*;


public class Temperatures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int resposta = 10000;
        int temporario = 0;
        List<Integer> listaTemperaturas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            listaTemperaturas.add(t);
        }
        if (listaTemperaturas.size() == 0) {
            System.out.println(0); // resolvido o caso de 0;
        } else {
            for (int i = 0; i < listaTemperaturas.size(); i++) { //iterando pela lista
                temporario = listaTemperaturas.get(i);
                if (Math.abs(temporario) < Math.abs(resposta)) {
                    resposta = temporario;
                } else if (Math.abs(temporario) == Math.abs(resposta) && temporario != resposta) {
                    resposta = Math.abs(temporario);
                }
            }
            System.out.println(resposta);
        }
    }
}
