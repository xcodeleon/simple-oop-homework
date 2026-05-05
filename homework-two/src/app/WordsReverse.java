package app;

public class WordsReverse {

    public static String getWordsReverse(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return null;
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) {
                return null;
            }
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
