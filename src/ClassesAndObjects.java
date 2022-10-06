public class ClassesAndObjects {
    public static void main(String[] args) { //метод main
        Person personOne = new Person();
        personOne.name = "Alister";
        personOne.age = 23;
        System.out.println("Меня зовут " + personOne.name + ", мне " + personOne.age);


        Person personTwo = new Person();
        personTwo.name = "Rick";
        personTwo.age = 47;
        System.out.println("Меня зовут " + personTwo.name + ", мне " + personTwo.age);
    }
}
class Person{
    //У класса могут быть
    // 1. Данные (поля)
    // 2. Действия которые он может совершить (методы)
    String name;
    int age;
}
/*class test{

}
class testTwo{

}*/
