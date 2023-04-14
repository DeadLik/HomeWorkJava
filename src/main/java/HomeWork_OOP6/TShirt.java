package HomeWork_OOP6;

import HomeWork_OOP6.interfaces.IntM;
import HomeWork_OOP6.interfaces.IntS;

public class TShirt implements IntM, IntS {

    @Override
    public void sizeM() {
        System.out.println("Размер М для футболки");
    }

    @Override
    public void sizeS() {
        System.out.println("Размер S для футболки");
    }
}
