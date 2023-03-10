/*3. Создать список типа ArrayList<String>. Поместить в него как строки,
        так и целые числа. Пройти по списку, найти и удалить целые числа.*/

package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MixList();
    }

    public static void MixList() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("123");
        list.add("456");
        list.add("grape");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (IsInteger(element)) {
                iterator.remove();
            }
        }

        for (String element : list) {
            System.out.println(element);
        }
    }

    public static boolean IsInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
