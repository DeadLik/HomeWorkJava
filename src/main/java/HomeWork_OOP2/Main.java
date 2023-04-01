package HomeWork_OOP2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Parent("Том", 20);
        Person person2 = new Parent("Мария", 15);
        Person person3 = new Child("Девид", 25);
        Person person4 = new Child("Сара", 15);
        Person person5 = new Child("Джеймс", 23);

        GenealogyTree genealogyTree = new GenealogyTreeImpl();
        genealogyTree.addPerson(person1);
        genealogyTree.addPerson(person2);
        genealogyTree.addPerson(person3);
        genealogyTree.addPerson(person4);
        genealogyTree.addPerson(person5);

        person1.addChild(person3);
        person1.addChild(person4);
        person2.addChild(person5);

        List<Person> descendants = genealogyTree.getDescendants(person1);

        System.out.println("Дети " + person1.getName() + ":");
        for (Person descendant : descendants) {
            System.out.println(descendant.getName() + " (" + descendant.getClass().getSimpleName() + ")");
        }

        //Кот и человек
        PersonNew person = new PersonNew("Иван");
        Cat cat = new Cat("Кис-кис");

        System.out.println();
        person.call(cat);
    }
}
