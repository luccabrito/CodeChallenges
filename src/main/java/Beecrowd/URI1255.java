package Beecrowd;

import java.util.*;

// NÃO RESOLVIDO

public class URI1255 {
    public static void main(String[] args) {
        encontrarCharMaisFrequente("frequency letters");
    }

    private static String encontrarCharMaisFrequente(String str) {
        char[] array = str.toCharArray();
        Set<Character> maxChars = new LinkedHashSet<Character>();

        int maxCount = 1;
        maxChars.add(array[0]);

        for(int i = 0, j = 0; i < str.length() - 1; i = j){
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChars.clear();
                maxChars.add(array[i]);
            } else if (count == maxCount) {
                maxChars.add(array[i]);
            }
        }
        return (maxChars + " = " + maxCount);
        /*List<Character> lista = maxChars.stream().sorted().toList();
        return lista.stream().map(Objects::toString).collect(Collectors.joining(""));*/
    }
}
