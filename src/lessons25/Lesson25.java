package lessons25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        dog.setName("Arch");
        System.out.println(animal.getName());
        dog.showName();
    }
}
