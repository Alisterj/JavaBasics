package Lessons34;

import Lesson33.Animal;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ////////////////////////////// Before java 5 ////////////////////////////////////

        /*
        List list = new ArrayList<>();
        list.add();// Добавлять можем до тех пор пока есть мето на компьютере
        //при добавление .add arrayList расширяется динамически
        */
        List animals = new ArrayList<>();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        /*
        String animal = animals.get(1); //list хранит в себе object, что бы мы не положили, все рассматривается как объект класса object
        //И так было до java5
        */

        String animal = (String) animals.get(3);
        System.out.println(animal); //Не удобная фитча, так downcasting this object

        /////////////////////////////// After Java 5 ///////////////////////////////////

        List <String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal); // Недьзя добавлять не объекты типа String

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        //////////////////////////////// After Java 7 ////////////////////////////////////

        List <String> animals3 = new ArrayList<>();
    }
}
