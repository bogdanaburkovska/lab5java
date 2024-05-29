import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення текстового рядка
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();

        // Підрахунок кількості слів, які починаються з голосної літери
        int vowelStartWordCount = countVowelStartWords(text);

        // Виведення слів з непарною кількістю приголосних літер
        printWordsWithOddConsonants(text);

        // Виведення результатів
        System.out.println("\nКількість слів, які починаються з голосної літери: " + vowelStartWordCount);
    }

    // Метод для підрахунку кількості слів, які починаються з голосної літери
    private static int countVowelStartWords(String text) {
        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            if (!word.isEmpty() && startsWithVowel(word)) {
                count++;
            }
        }
        return count;
    }

    // Метод для перевірки, чи починається слово з голосної літери
    private static boolean startsWithVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (isVowel(c)) {
                return true;
            } else if (Character.isLetter(c)) {
                return false;
            }
        }
        return false;
    }

    // Метод для перевірки, чи є символ голосною літерою
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

    // Метод для виведення слів з непарною кількістю приголосних літер
    private static void printWordsWithOddConsonants(String text) {
        System.out.println("\nСлова з непарною кількістю приголосних літер:");
        String[] words = text.split(" ");
        for (String word : words) {
            if (countConsonants(word) % 2 != 0) {
                System.out.println(word);
            }
        }
    }

    // Метод для підрахунку кількості приголосних літер у слові
    private static int countConsonants(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c) && !isVowel(c)) {
                count++;
            }
        }
        return count;
    }
}
