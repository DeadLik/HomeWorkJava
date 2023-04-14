package HomeWork_OOP6;

import HomeWork_OOP6.interfaces.IntM;
import HomeWork_OOP6.interfaces.IntXL;

public class Jacket implements IntXL, IntM {

    @Override
    public void sizeM() {
        System.out.println("Размер М для куртки");
    }

    @Override
    public void sizeXL() {
        System.out.println("Размер XL для куртки");
    }
}
