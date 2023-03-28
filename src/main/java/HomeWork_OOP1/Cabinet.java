package HomeWork_OOP1;

class Cabinet {
    private boolean isOpen;

    public Cabinet() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open(Man man) {
        if (man.getSpouse().allowsToOpenCabinet()) {
            isOpen = true;
            System.out.println("Шкаф открыт");
        } else {
            System.out.println("Вам не разрешено открывать шкаф");
        }
    }
}
