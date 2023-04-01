package HomeWork_OOP2;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private int birthDate;
    private List<Person> children;

    public Person(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }
}
