/*2. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.*/

package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        trueFalseYear(year);
    }

    public static boolean trueFalseYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Высококостный");
                    return true;
                } else {
                    System.out.println("Не высококостный");
                    return false;
                }
            } else {
                System.out.println("Высококостный");
                return true;
            }
        } else {
            System.out.println("Не высококостный");
            return false;
        }
    }
}
