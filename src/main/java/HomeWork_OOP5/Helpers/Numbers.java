package HomeWork_OOP5.Helpers;

import java.util.Random;

public class Numbers {
    public static Random r = new Random();
    public static Number getR(int x) {return r.nextInt(x, x+10);}
}
