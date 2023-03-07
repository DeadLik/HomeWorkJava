/*1. Напишите метод, который принимает на вход строку (String)
        и определяет является ли строка палиндромом (возвращает boolean значение).*/

package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        String s = "Кот";
        if (isPalindrome(s)) {
            System.out.println(s + " - палиндром");
        } else {
            System.out.println(s + " - не палиндром");
        }

    }


    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
