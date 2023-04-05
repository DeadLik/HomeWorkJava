package HomeWork_OOP3;

import java.time.LocalDate;

public class Child extends Person {
    public Child(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public boolean canHaveChildren() {
        return false;
    }
}
