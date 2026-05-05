package app;

/*
Напишите метод public static int maxCharIndex(String), возвращающий индекс первого встреченного символа,
который встречается чаще всего в строке. Если символов несколько, которые встречаются одинаковое количество раз,
то любого из них. При передаче null и пустой строкой или строкой из одних пробелов вернуть -1.

  Пример:
      0123456789
  s->"ddcccabbbb"
  return 6
 */

public class WordsReverseInColumn {

    public static String getWordsReverseInColumn(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Wrong string");
            return null;
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append("\n");
        }
        return result.toString().trim();
    }
}
