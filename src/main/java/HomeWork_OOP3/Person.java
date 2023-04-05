package HomeWork_OOP3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Person implements HasChildren {
    private String name;
    private LocalDate birthDate;
    private List<Person> children;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Использование этого интерфейса вместо абстрактного метода addChild, чтобы позволить только тем объектам, которые могут иметь детей, добавлять их
    public void addChild(Person child) {
        if (this instanceof HasChildren && ((HasChildren) this).canHaveChildren()) {
            children.add(child);
        }
    }

    // Использование функционального интерфейса для метода getChildren, чтобы фильтровать детей в соответствии с определенными критериями
    public List<Person> getChildren(Predicate<Person> filter) {
        return children.stream().filter(filter).collect(Collectors.toList());
    }
}
