/*2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.*/

package HomeWork2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String repeatedString = repeatString("TEST", 100);
        String fileName = "task2.txt";
        try {
            writeToFile(fileName, repeatedString);
            System.out.println("Файл успешно записан.");
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }

    private static String repeatString(String str, int n) {
        return new String(new char[n]).replace("\0", str);
    }

    private static void writeToFile(String fileName, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(content);
        writer.close();
    }
}
