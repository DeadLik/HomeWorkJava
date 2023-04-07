package HomeWork_OOP4;

public class Persian<T extends String> extends Cat implements ActionsCat{

    private T breed;

    public Persian(String name, Number age, String color, T breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public T getBreed() {
        return breed;
    }

    @Override
    public void meow() {
        System.out.println(getName() + ":" + " Мяяяяяяяяяяяяяяяяяяяяуууу!!!!!!!!!!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " поел мяса");
    }
}
