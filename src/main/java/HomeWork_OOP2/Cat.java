package HomeWork_OOP2;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}
