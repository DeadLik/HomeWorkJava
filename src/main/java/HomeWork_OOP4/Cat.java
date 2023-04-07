package HomeWork_OOP4;

public abstract class Cat<T extends Number> {
    private String name;
    private T age;
    private String color;

    public Cat(String name, T age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
}
