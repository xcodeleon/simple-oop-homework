package app;

public class MaxCharIndex {

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }

        int[] freq = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = 0;
        char maxChar = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == maxChar) {
                return i;
            }
        }
        return -1;
    }
}
