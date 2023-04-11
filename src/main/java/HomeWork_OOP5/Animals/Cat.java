package HomeWork_OOP5.Animals;

import HomeWork_OOP5.Interfaces.ActionAnimal;

public class Cat extends Animals implements ActionAnimal {

    public Cat(String type, String name, String color, String gender, Number age, Number weight) {
        super(type, name, color, gender, age, weight);
    }

    @Override
    public String voice() {return "Mяу, Мяу";}

    @Override
    public String toString() {
        return "Кот{" +
                "порода='" + type + '\'' +
                ", имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", пол='" + gender + '\'' +
                ", возраст=" + age +
                ", вес=" + weight +
                '}';
    }
}
