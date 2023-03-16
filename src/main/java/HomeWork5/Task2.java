/*Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности.*/

package HomeWork5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Аня", "Коля", "Катя", "Аня", "Света", "Коля", "Дима", "Аня", "Коля"};

        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNameCount = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedNameCount, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : sortedNameCount) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
            }
        }
    }
}
