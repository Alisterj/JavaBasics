package Lesson35;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Wildcard (Generics)
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1, "fox"));
        listOfAnimal.add(new Animal(2, "mouse"));

        test(listOfAnimal);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);

        Object object = new Object();
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            animal.eat();
        }
    }
}
