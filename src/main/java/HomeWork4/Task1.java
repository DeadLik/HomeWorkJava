/*1. Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.*/

package HomeWork4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    private static ArrayList<String> memory = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введите значение для строки.\nДля выхода используйте 'print' или 'revert'");
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            String input = scanner.nextLine();

            if (input.equals("print")) {
                for (int i = memory.size() - 1; i >= 0; i--) {
                    System.out.print(memory.get(i) + " ");
                    check = false;
                }
            } else if (input.equals("revert")) {
                if (!memory.isEmpty()) {
                    memory.remove(memory.size() - 1);
                    System.out.println(memory);
                    check = false;
                }
            } else {
                memory.add(input);
            }
        }
    }
}
