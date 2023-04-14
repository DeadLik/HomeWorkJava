package HomeWork_OOP6;

import HomeWork_OOP6.interfaces.IntL;
import HomeWork_OOP6.interfaces.IntM;
import HomeWork_OOP6.interfaces.IntXL;

public class Jeans implements IntXL, IntM, IntL{

    @Override
    public void sizeL() {
        System.out.println("Размер L для джинсов");
    }

    @Override
    public void sizeM() {
        System.out.println("Размер M для джинсов");
    }

    @Override
    public void sizeXL() {
        System.out.println("Размер XL для джинсов");
    }
}
