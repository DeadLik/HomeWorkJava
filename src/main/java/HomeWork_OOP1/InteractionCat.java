package HomeWork_OOP1;

public class InteractionCat {
    public void respondToCall() {
        System.out.println("Мяу");
    }

    public void playWith(InteractionMan man) {
        System.out.println("Кот играет с " + man.getName());
    }
}
