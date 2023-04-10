package HomeWork_OOP5.Humanoids;

import HomeWork_OOP5.Interfaces.ActionHuman;

public class Owner extends Humans implements ActionHuman {

    public Owner(String name, String status, String gender, Number age) {
        super(name, status, gender, age);
    }


    @Override
    public String action() {
        return "Привел/а на обследование своего питомца";
    }

    @Override
    public String toString() {
        return "Хозяин{" +
                "имя='" + name + '\'' +
                ", должность='" + status + '\'' +
                ", пол='" + gender + '\'' +
                ", возраст=" + age +
                '}';
    }
}
