package app;

/*
Напишите метод public static void printSubStringReverse(String string, int start, int finish), который принимает строку и индекс
символа стартовый и индекс символа финишный.

Метод выводит на консоль строку, в которой символы от старта включительно до финиша включительно печатаются на консоль в реверсе,
а остальные в обычном порядке.

  Пример:
  Передаем в метод строку: string = “Hello world!” start = 1 finish = 4

  Выводим в консоль: Holle world!
Если строка null или пустая или состоит только из пробелов или индексы start, или finish выходят за пределы строки или start больше finish, то метод выводит сообщение Wrong args.
 */

public class SubStringReverse {
    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isEmpty() || start < 0 || finish >= string.length() || start > finish) {
            System.out.println("Wrong args");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < start; i++) {
            result.append(string.charAt(i));
        }

        for (int i = finish; i >= start; i--) {
            result.append(string.charAt(i));
        }

        for (int i = finish + 1; i < string.length(); i++) {
            result.append(string.charAt(i));
        }

        System.out.println(result.toString());
    }
}
