package HomeWork_OOP5.Humanoids;

import HomeWork_OOP5.Interfaces.ActionHuman;

import java.util.Random;

public class Doctor extends Humans implements ActionHuman {

    public Doctor(String name, String status, String gender, Number age) {
        super(name, status, gender, age);
    }

    @Override
    public String toString() {
        return "Доктор{" +
                "имя='" + name + '\'' +
                ", должность='" + status + '\'' +
                ", пол='" + gender + '\'' +
                ", возраст=" + age +
                '}';
    }

    @Override
    public String action() {
        return "Обследует животное";
    }

    public String treatment() {
        Random random = new Random();
        int treatmentAction = random.nextInt(1, 4);

        switch (treatmentAction) {
            case 1:
                return getName() + ": сделал укол";
            case 2:
                return getName() + ": дал таблетку";
            case 3:
                return getName() + ": животное здорово";
        }
        return getName() + "ничего не сделал";
    }

}
