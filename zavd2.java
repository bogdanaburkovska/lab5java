import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         String filePath = "src/main/java/111.txt";

        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            int wordCount = 0;

            System.out.println("Слова, які починаються на 's':");

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.startsWith("s") || word.startsWith("S")) {
                    System.out.println(word);
                    wordCount++;
                }
            }

            System.out.println("Загальна кількість слів, що починаються на 's': " + wordCount);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не знайдено: " + filePath);
        }
    }
}
