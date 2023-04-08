package HomeWork_OOP4;

public class British<T extends String> extends Cat implements ActionsCat{

    private T breed;

    public British(String name, Number age, String color, T breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public T getBreed() {
        return breed;
    }

    @Override
    public void meow() {
        System.out.println(getName() + ":" + " Мямямммяяяяя");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " сгрыз тапок");
    }
}
