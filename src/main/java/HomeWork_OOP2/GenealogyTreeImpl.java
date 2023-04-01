package HomeWork_OOP2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenealogyTreeImpl implements GenealogyTree{
    private Map<Person, List<Person>> tree;

    public GenealogyTreeImpl() {
        this.tree = new HashMap<>();
    }

    @Override
    public void addPerson(Person person) {
        tree.put(person, person.getChildren());
    }

    @Override
    public List<Person> getDescendants(Person person) {
        return tree.getOrDefault(person, Collections.emptyList());
    }
}
