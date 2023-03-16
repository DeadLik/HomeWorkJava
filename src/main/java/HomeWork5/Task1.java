/*1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        2. Пусть дан список сотрудников:
        Иван Иванов
        Светлана Петрова
        Кристина Белова
        Анна Мусина
        Анна Крутова
        Иван Юрин
        Петр Лыков
        Павел Чернов
        Петр Чернышов
        Мария Федорова
        Марина Светлова
        Мария Савина
        Мария Рыкова
        Марина Лугова
        Анна Владимирова
        Иван Мечников
        Петр Петин
        Иван Ежов*/

package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Иван Иванов", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Светлана Петрова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Кристина Белова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Анна Мусина", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Анна Крутова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Иван Юрин", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Петр Лыков", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Павел Чернов", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Петр Чернышов", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Мария Федорова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Марина Светлова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Мария Савина", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Мария Рыкова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Марина Лугова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Анна Владимирова", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Иван Мечников", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Петр Петин", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Иван Ежов", "+7-xxx-xxx-xxxx");

        addContact(phoneBook, "Иван Иванов", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Иван Иванов", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Анна Мусина", "+7-xxx-xxx-xxxx");
        addContact(phoneBook, "Анна Мусина", "+7-xxx-xxx-xxxx");

        printPhoneBook(phoneBook);
    }

    private static void addContact(Map<String, List<String>> phoneBook, String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    private static void printPhoneBook(Map<String, List<String>> phoneBook) {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<String> phones = entry.getValue();
            for (String phone : phones) {
                System.out.print(phone + " ");
            }
            System.out.println();
        }
    }
}
