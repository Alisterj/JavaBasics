import java.util.function.Predicate;

public class ClassesAndObjects {
    public static void main(String[] args) { //метод main
        Person personOne = new Person();
        personOne.name = "Alister";
        personOne.age = 25;
        personOne.sayHello();

        System.out.println();

        Person personTwo = new Person();
        personTwo.name = "Rick";
        personTwo.age = 47;
        personTwo.speak();
    }
}
class Person {
    //У класса могут быть
    // 1. Данные (поля)
    // 2. Действия которые он может совершить (методы)
    String name;
    int age;

//  Predicate<String> x = s -> false; // еще раз повторить и разобрать
    /*
    Predicate<String> x = new Predicate<String>() {   // еще раз повторить и разобрать
    @Override
    public boolean test(String s) {
        return false;
    }
    */

    void speak() {
        for (int i = 0; i < 3; i++)
            System.out.printf("Меня зовут %s, мне %s лет%n", name, age); //1 вариант написания
        //System.out.println("Меня зовут %s, мне %s лет%n".formatted(name, age)); //2 вариант написания
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
/*
class test{

}
class testTwo{

}
*/