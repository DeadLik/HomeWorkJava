package HomeWork_OOP2;

import java.util.List;

public interface GenealogyTree {
    void addPerson(Person person);
    List<Person> getDescendants(Person person);
}
