package HomeWork_OOP1;

class Man {
    private String name;
    private Woman spouse;

    public Man(String name, Woman spouse) {
        this.name = name;
        this.spouse = spouse;
    }

    public String getName() {
        return name;
    }

    public Woman getSpouse() {
        return spouse;
    }

    public void callCat(Cat cat) {
        cat.respondToCall();
    }
}

