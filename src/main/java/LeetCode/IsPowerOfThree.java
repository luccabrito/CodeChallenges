package LeetCode;

/*
        Given an integer n, return true if it is a power of three. Otherwise, return false.
        An integer n is a power of three, if there exists an integer x such that n == 3x.
 */

public class IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) {
            n = n/3;
        }
        return n == 1;
    }
}
