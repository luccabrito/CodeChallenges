package LeetCode;

import java.util.ArrayList;
import java.util.List;
        /*
        Given an integer n, return a string array answer (1-indexed) where:
            answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
            answer[i] == "Fizz" if i is divisible by 3.
            answer[i] == "Buzz" if i is divisible by 5.
            answer[i] == i (as a string) if none of the above conditions are true.
         */
public class FizzBuzz {

    public static void main(String[] args) {
        List<String> palavras = fizzBuzz(16);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> resposta = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resposta.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resposta.add("Fizz");
            } else if (i % 5 == 0) {
                resposta.add("Buzz");
            } else {
                resposta.add(String.valueOf(i));
            }
        }
        return resposta;
    }
}
