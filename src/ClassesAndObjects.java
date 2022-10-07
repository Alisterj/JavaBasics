import java.util.function.Predicate;

public class ClassesAndObjects {
    public static void main(String[] args) { //метод main
        Person personOne = new Person();
        personOne.setNameAndAge("Alister", 25);
        personOne.speak();
        personOne.sayHello();
        int yearOne = personOne.calculateYears();

        ///////////////////////////////////////
        System.out.println();
        ///////////////////////////////////////

        Person personTwo = new Person();
        personTwo.setNameAndAge("Rick", 47);
        personTwo.speak();
        int yearTwo = personTwo.calculateYears();

        ///////////////////////////////////////
        System.out.println();
        ///////////////////////////////////////

        System.out.printf("Первому человеку до пенсии: %s лет%n", yearOne);
        System.out.printf("Второму человеку до пенсии: %s лет%n", yearTwo);
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

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    int calculateYears() {
        int years = 65 - age;
        return years;
        //System.out.printf("Количество лет до пенсии: %s", years);
    }

    void speak() {
        Integer x = sayHello(); //

        for (int i = 0; i < 3; i++)
            System.out.printf("Меня зовут %s, мне %s лет%n", name, age); //1 вариант написания
        //System.out.println("Меня зовут %s, мне %s лет%n".formatted(name, age)); //2 вариант написания
    }
    int sayHello() {
        System.out.println("Привет!");
        return 1;
    }
}
/*
class test{

}
class testTwo{

}
*/