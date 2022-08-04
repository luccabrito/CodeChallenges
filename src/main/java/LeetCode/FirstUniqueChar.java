package LeetCode;

public class FirstUniqueChar {
    public static void main(String[] args) {
        firstUniqChar("abcxyz");
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (freq[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}
