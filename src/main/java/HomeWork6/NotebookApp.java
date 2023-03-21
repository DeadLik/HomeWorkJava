package HomeWork6;

import java.util.*;

public class NotebookApp {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Dell", 16, 512, "Windows", "Silver", 1200.0));
        notebooks.add(new Notebook("MacBook", 16, 512, "macOS", "Gray", 2000.0));
        notebooks.add(new Notebook("HP", 8, 256, "Windows", "White", 1000.0));
        notebooks.add(new Notebook("Lenovo", 8, 512, "Windows", "Black", 800.0));
        notebooks.add(new Notebook("Asus", 16, 1_000, "Windows", "Blue", 1500.0));

        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "RAM");
        filterCriteria.put(2, "Hdd");
        filterCriteria.put(3, "OS");
        filterCriteria.put(4, "Color");

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterParams = new HashMap<>();
        for (Integer key : filterCriteria.keySet()) {
            System.out.print("Введите минимальное значение для критерия \"" + filterCriteria.get(key) + "\": ");
            Object value = null;
            if (key == 1 || key == 2) {
                value = scanner.nextInt();
            } else if (key == 3 || key == 4) {
                value = scanner.next();
            }
            filterParams.put(filterCriteria.get(key), value);
        }

        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean isMatch = true;
            for (String key : filterParams.keySet()) {
                Object value = filterParams.get(key);
                if (key.equals("RAM") && notebook.getRam() < (int) value) {
                    isMatch = false;
                    break;
                } else if (key.equals("Hdd") && notebook.getHdd() < (int) value) {
                    isMatch = false;
                    break;
                } else if (key.equals("OS") && !notebook.getOs().equals(value)) {
                    isMatch = false;
                    break;
                } else if (key.equals("Color") && !notebook.getColor().equals(value)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                filteredNotebooks.add(notebook);
            }
        }

        System.out.println("Результаты фильтрации:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getPrice() + " USD");
        }
    }
}
