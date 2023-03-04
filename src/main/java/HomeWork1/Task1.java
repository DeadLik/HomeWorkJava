//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        minMaxArray();
    }

    private static void minMaxArray() {
        int[] arr = {5, 10, 15, 20, 25};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
