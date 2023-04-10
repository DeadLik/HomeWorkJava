package HomeWork_OOP5;

import HomeWork_OOP5.Animals.Animals;
import HomeWork_OOP5.Animals.Cat;
import HomeWork_OOP5.Animals.Dog;
import HomeWork_OOP5.Animals.Pig;
import HomeWork_OOP5.Helpers.Numbers;
import HomeWork_OOP5.Humanoids.Doctor;
import HomeWork_OOP5.Humanoids.Owner;

import java.util.*;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        Doctor doctor = new Doctor("Артем", "Ветеринар", "Мужской", Numbers.getR(25));

        Owner owner1 = new Owner("Антон", "Менеджер", "Мужской", Numbers.getR(25));
        Owner owner2 = new Owner("Боб", "Директор", "Мужской", Numbers.getR(25));
        Owner owner3 = new Owner("Света", "Продавец", "Женский", Numbers.getR(25));
        Owner owner4 = new Owner("Коля", "Маркетолог", "Мужской", Numbers.getR(25));
        Owner owner5 = new Owner("Елена", "Юрист", "Женский", Numbers.getR(25));

        Cat cat = new Cat("Персидский", "Мира", "Коричневый", "Женский", Numbers.getR(2), Numbers.getR(5));
        Cat cat1 = new Cat("Шотландский", "Роза", "Рыжий", "Женский", Numbers.getR(2), Numbers.getR(5));

        Pig pig = new Pig("Карликовая", "Ненси", "Серый", "Женский", Numbers.getR(2), Numbers.getR(5));

        Dog dog = new Dog("Терьер", "Борзый", "Черный", "Мужской", Numbers.getR(2), Numbers.getR(5));
        Dog dog1 = new Dog("Спаниель", "Капер", "Белый", "Мужской", Numbers.getR(2), Numbers.getR(5));

        List<Owner> owners = new ArrayList<>(Arrays.asList(owner1, owner2, owner3, owner4, owner5));
        List<Animals> animals = new ArrayList<>(Arrays.asList(cat,cat1,pig,dog,dog1));

        for (int i = 0; i < owners.size() && i < animals.size(); i++) {
            int visitors = random.nextInt(0,5);
            System.out.println();
            Thread.sleep(500);
            System.out.println(owners.get(visitors) + " " + owners.get(visitors).action() + ": " + animals.get(visitors));
            System.out.println(animals.get(visitors) + " " + animals.get(visitors).voice());
            System.out.println(doctor + " " + doctor.action() + ": " + animals.get(visitors));
            Thread.sleep(1000);
            System.out.println(doctor.treatment() + ": " + animals.get(visitors));
            System.out.println();
        }
    }
}
