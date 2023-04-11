package HomeWork_OOP5.Animals;

import HomeWork_OOP5.Interfaces.ActionAnimal;

public class Animals<S extends String, N extends Number> implements ActionAnimal {
    S type, name, color, gender;
    N age, weight;


    public Animals(S type, S name, S color, S gender, N age, N weight) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public S getType() {return type;}
    public void setType(S type) {this.type = type;}
    public S getName() {return name;}
    public void setName(S name) {this.name = name;}
    public S getColor() {return color;}
    public S getGender() {return gender;}
    public N getAge() {return age;}
    public void setAge(N age) {this.age = age;}
    public N getWeight() {return weight;}
    public void setWeight(N weight) {this.weight = weight;}

    @Override
    public String voice() {
        return "Неизвестный звук";
    }
}
