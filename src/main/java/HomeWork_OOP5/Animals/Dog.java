package HomeWork_OOP5.Animals;

import HomeWork_OOP5.Interfaces.ActionAnimal;

public class Dog extends Animals implements ActionAnimal {


    public Dog(String type, String name, String color, String gender, Number age, Number weight) {
        super(type, name, color, gender, age, weight);
    }

    @Override
    public String voice() {
        return "Гав, гав";
    }

    @Override
    public String toString() {
        return "Собака{" +
                "порода='" + type + '\'' +
                ", имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", пол='" + gender + '\'' +
                ", возраст=" + age +
                ", вес=" + weight +
                '}';
    }
}
