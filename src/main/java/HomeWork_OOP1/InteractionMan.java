package HomeWork_OOP1;

public class InteractionMan {
    private String name;

    public InteractionMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void callCat(InteractionCat cat) {
        cat.respondToCall();
    }
}
