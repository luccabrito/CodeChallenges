package LeetCode;

/* Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory. */

public class ReverseString {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        reverseString(array);
        System.out.println(array);
    }

    public static void reverseString(char[] s) {
        int metadeArray = (int) Math.floor(s.length / 2);
        for (int i = 0; i < metadeArray; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
