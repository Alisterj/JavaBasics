package Lesson36;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        /*
        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
         */

        Animal animal1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal1.eat();
    }
}
