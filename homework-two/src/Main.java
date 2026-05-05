
import app.WordsReverse;
import app.WordsReverseInColumn;

import java.util.Scanner;

import static app.MaxCharIndex.maxCharIndex;
import static app.PhoneNumber.isPhoneNumber;
import static app.StringReverse.printStringReverse;
import static app.SubStringReverse.printSubStringReverse;

public class Main {
    public static void main(String[] args) {

        // 1 метод
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();

            printStringReverse(text);
        }

        // 2 метод
        System.out.println(isPhoneNumber("81234567890"));
        System.out.println(isPhoneNumber("71234567890"));
        System.out.println(isPhoneNumber("81234a67890"));
        System.out.println(isPhoneNumber(""));
        System.out.println(isPhoneNumber("   "));


        // 3 метод

        try (Scanner scanner2 = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String input = scanner2.nextLine();

            System.out.print("Введите start: ");
            int start = scanner2.nextInt();

            System.out.print("Введите finish: ");
            int finish = scanner2.nextInt();

            printSubStringReverse(input, start, finish);
        }

        // 4 метод
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner3.nextLine();

        String result = WordsReverse.getWordsReverse(input);

        System.out.println(result);

        // 5 метод

        Scanner scanner5 = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input1 = scanner5.nextLine();

        String result1 = WordsReverseInColumn.getWordsReverseInColumn(input);

        if (result != null) {
            System.out.println(result);
        }

        // 6 метод
        Scanner scanner6 = new Scanner(System.in);
        String input6 = scanner6.nextLine();

        System.out.println(maxCharIndex(input6));

        scanner6.close();
    }
}

