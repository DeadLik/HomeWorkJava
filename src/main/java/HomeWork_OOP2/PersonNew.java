package HomeWork_OOP2;

public class PersonNew {
    private String name;

    public PersonNew(String name) {
        this.name = name;
    }

    public void call(Animal animal) {
        System.out.println(name + " зовет " + animal.getName());
        animal.makeSound();
    }
}
