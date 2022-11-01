package lessons25;

public class ClassesAndObjects {
    public static void main(String[] args) { //метод main
        Person personOne = new Person();
        personOne.setName("");
        personOne.setAge(-36);
        //personOne.setNameAndAge("Alister", 25);
        //personOne.speak();

        System.out.printf("Выводим значение в main методе: %s%n", personOne.getName());
        System.out.printf("Выводим значение в main методе: %s%n", personOne.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName){
        if(userName.isEmpty())
            System.out.println("Введено пустое имя");
        else
            name = userName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0)
            System.out.println("Вы ввели некорректное значение, возраст должен быть положительным");
        else
            age = userAge;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        for (int i = 0; i < 3; i++)
            System.out.printf("Меня зовут %s, мне %s лет%n", name, age); //1 вариант написания
        //System.out.println("Меня зовут %s, мне %s лет%n".formatted(name, age)); //2 вариант написания
    }

    //  Predicate<String> x = s -> false; // еще раз повторить и разобрать
    /*
    Predicate<String> x = new Predicate<String>() {   // еще раз повторить и разобрать
    @Override
    public boolean test(String s) {
        return false;
    }
    */
}
/*
class test{

}
class testTwo{

}
*/