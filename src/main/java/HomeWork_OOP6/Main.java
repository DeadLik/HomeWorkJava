package HomeWork_OOP6;

public class Main {
    public static void main(String[] args) {
        Jacket jacket = new Jacket();
        Jeans jeans = new Jeans();
        TShirt tShirt = new TShirt();

        System.out.println("На складе есть:");
        jacket.sizeM();
        jacket.sizeXL();

        jeans.sizeL();
        jeans.sizeXL();
        jeans.sizeM();

        tShirt.sizeS();
        tShirt.sizeM();
    }
}
