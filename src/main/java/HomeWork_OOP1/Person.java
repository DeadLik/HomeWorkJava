// Задание 1

package HomeWork_OOP1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setParents(Person father, Person mother) {
        this.parents.add(father);
        this.parents.add(mother);
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }
}
