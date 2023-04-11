package HomeWork_OOP5.Animals;

import HomeWork_OOP5.Interfaces.ActionAnimal;

public class Pig extends Animals implements ActionAnimal {
    public Pig(String type, String name, String color, String gender, Number age, Number weight) {
        super(type, name, color, gender, age, weight);
    }

    @Override
    public String voice() {return "Хрю, хрю";}

    @Override
    public String toString() {
        return "Свинья{" +
                "порода='" + type + '\'' +
                ", имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", пол='" + gender + '\'' +
                ", возраст=" + age +
                ", вес=" + weight +
                '}';
    }

}
