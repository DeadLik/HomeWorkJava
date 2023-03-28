package HomeWork_OOP1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Задание 1

        Person father = new Person("Андрей", 50);
        Person mother = new Person("Юля", 45);
        Person son = new Person("Ваня", 25);
        Person daughter = new Person("Света", 22);

        father.addChild(son);
        mother.addChild(son);
        father.addChild(daughter);
        mother.addChild(daughter);

        son.setParents(father, mother);
        daughter.setParents(father, mother);

        List<Person> children = father.getChildren();
        for (Person child : children) {
            System.out.println("Ребёнок: " + child.getName());
        }

        // Задание 2
        // Логика взаимодействия шкафа и человека

        Woman woman = new Woman("Аня", true);
        Man man = new Man("Коля", woman);
        Cabinet cabinet = new Cabinet();
        System.out.println();
        cabinet.open(man);

        // Задание 2
        // Логика взаимодействия человека и кота

        InteractionMan owner = new InteractionMan("Сергей");
        InteractionCat cat = new InteractionCat();
        System.out.println();
        owner.callCat(cat);
        cat.playWith(owner);

    }
}
