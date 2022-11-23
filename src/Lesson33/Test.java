package Lesson33;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //upcasting - восходящеее преобразование
        //производиться не явно
        Dog dog = new Dog();
        Animal animal = new Dog();

        //downcasting - нисходящее преобразование
        Dog dog1 = (Dog) animal;
        dog1.bark();
        //downcasting не всегда безопасно


        ////////////////////////////
        Animal a = new Animal();
        Dog d = (Dog) a;
        d.bark();
    }
}
