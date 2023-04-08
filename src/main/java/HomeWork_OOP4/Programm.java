package HomeWork_OOP4;

public class Programm {
    public static void main(String[] args) {

        Persian<String> persian = new Persian<>("Бублик", 5,"Коричневый", "Персидский");
        British<String> british = new British<>("Модник", 3.5, "Серый", "Британец");

        System.out.println("Имя кота " + persian.getName() + ", возраст " + persian.getAge() + ", порода " + persian.getBreed());
        System.out.println("Имя кота " + british.getName() + ", возраст " + british.getAge() + ", порода " + british.getBreed());

        System.out.println("---------------------");
        persian.meow();
        persian.eat();
        System.out.println("---------------------");
        british.meow();
        british.eat();
        System.out.println("---------------------");
        british.meow();
        persian.meow();
    }
}
