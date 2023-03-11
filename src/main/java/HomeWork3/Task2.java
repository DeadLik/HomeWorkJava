/*2. Задан целочисленный список ArrayList. Найти минимальное,
        максимальное и среднее арифметическое из этого списка.*/

package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        MinMaxList();
    }

    public static void MinMaxList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double avg = (double) sum / numbers.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + avg);
    }
}
