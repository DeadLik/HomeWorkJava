/*1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        (в языке уже есть что-то готовое для этого)*/

package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ListNumbers();
    }

    public static void ListNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
