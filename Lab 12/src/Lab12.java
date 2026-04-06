import java.util.Scanner;
import java.util.Arrays;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для анализа:");
        String input = scanner.nextLine();

        System.out.println("\n--- ОСНОВНЫЕ ЗАДАНИЯ ---");

        System.out.println("1. Длина: " + input.length());

        System.out.println("2. Верхний: " + input.toUpperCase());
        System.out.println("2. Нижний: " + input.toLowerCase());

        String[] words = input.trim().split("\\s+");
        System.out.println("3. Количество слов: " + (input.isEmpty() ? 0 : words.length));

        StringBuilder revWords = new StringBuilder();
        for (String w : words) revWords.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println("4. Слова задом наперед: " + revWords.toString().trim());

        System.out.println("5. Содержит 'Java'?: " + input.contains("Java"));

        System.out.println("6. Замена 'Java' на 'Python': " + input.replace("Java", "Python"));

        String clean = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalin = clean.equals(new StringBuilder(clean).reverse().toString());
        System.out.println("7. Это палиндром?: " + isPalin);

        System.out.println("8. Равна ли строке 'test'?: " + input.equals("test"));

        System.out.println("9. Разделение по пробелу: " + Arrays.toString(words));

        System.out.println("\n--- ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ ---");

        int v = 0, c = 0;
        String vowelsList = "aeiouyаеёиоуыэюя";
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) != -1) v++; else c++;
            }
        }
        System.out.println("10. Гласных: " + v + ", Согласных: " + c);

        System.out.println("11. Без пробелов: " + input.replace(" ", ""));

        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println("12. Самое длинное слово: " + longest);

        System.out.println("13. Символов без пробелов: " + input.replace(" ", "").length());

        System.out.println("14. Начинается с 'Hello'?: " + input.startsWith("Hello"));

        System.out.println("15. Заканчивается на '.'?: " + input.endsWith("."));

        System.out.println("16. Вся строка наоборот: " + new StringBuilder(input).reverse());

        System.out.println("17. Без цифр: " + input.replaceAll("\\d", ""));

        System.out.println("18. Гласные заменены: " + input.replaceAll("[aeiouyаеёиоуыэюяAEIOUYАЕЁИОУЫЭЮЯ]", "*"));

        if (!input.isEmpty()) {
            char first = input.charAt(0);
            long count = input.chars().filter(ch -> ch == first).count();
            System.out.println("19. Символ '" + first + "' встречается: " + count + " раз(а)");
        }


        System.out.println("20. Только цифры?: " + input.matches("\\d+"));
    }
}