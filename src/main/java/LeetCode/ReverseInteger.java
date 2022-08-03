package LeetCode;

/*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
    outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

public class ReverseInteger {

    public static int reverse(int x) {
        Integer i = x;
        StringBuilder texto = new StringBuilder();
        if (i.toString().charAt(0) == '-') {
            texto.append(i.toString().substring(1));
            texto.append('-');
        } else {
            texto.append(i.toString());
        }
        texto.reverse();
        Long valorRevertido = Long.valueOf(texto.toString());
        if (valorRevertido > 2147483647 || valorRevertido < -2147483648) {
            return 0;
        } else {
            Integer valorRevertido2 = Integer.valueOf(texto.toString());
            return valorRevertido2;
        }
    }
}
