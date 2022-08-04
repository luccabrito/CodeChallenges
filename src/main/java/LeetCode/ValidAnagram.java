package LeetCode;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freqPalavra1 = new int[26];
        int[] freqPalavra2 = new int[26];
        int tamanhoPalavra1 = s.length();
        int tamanhoPalavra2 = t.length();
        for (int i = 0; i < tamanhoPalavra1; i++) {
            int index = s.charAt(i) - 'a';
            freqPalavra1[index]++;
        }
        for (int i = 0; i < tamanhoPalavra2; i++) {
            int index = t.charAt(i) - 'a';
            freqPalavra2[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqPalavra1[i] != freqPalavra2[i]) {
                return false;
            }
        }
        return true;
     }
}
