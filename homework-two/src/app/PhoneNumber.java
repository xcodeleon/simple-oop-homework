package app;
/*
Напишите метод, который принимает строку и проверяет являться ли она номером телефона isPhoneNumber(String)
Если строка соответствует критериям:

Первая цифра 8;
Общее количество символов составляет 11;
Все символы должны быть цифрами.
То метод возвращает true, если нет то false.

Если строка null или пустая или состоит только из пробелов, то метод возвращает null
 */
public class PhoneNumber {

    public static Boolean isPhoneNumber(String str) {
        if (str == null || str.isBlank()) {
            return null;
        }

        return str.matches("8\\d{10}");
    }
}
