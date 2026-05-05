package app;

/*

Напишите метод public static void printStringReverse(String),
который принимает строку и выводит строку на консоль в реверсе.
Если строка null или пустая или состоит только из пробелов,
то выводит сообщение Wrong string.

 */

public class StringReverse {
    public static void printStringReverse(String text) {

        if (text == null || text.isBlank()) {
            System.out.println("Wrong string");
            return;
        }
        System.out.println(new StringBuilder(text).reverse());
    }
}
