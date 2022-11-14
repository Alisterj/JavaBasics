package Lesson30;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        //but

        Animal animal1 = new Dog(); //Здесь проявляется одна из сторон полиморфизма
        Dog dog1 = new Dog();

        animal1.eat();
        dog.eat();
        dog.bark();

        /////////////////////////////
        //Позднее связывание

        ////////////////////////////
        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        test(animal2);
        test(dog2);
        test(cat);

    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
