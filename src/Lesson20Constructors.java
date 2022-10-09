public class Lesson20Constructors {
    public static void main(String[] args) {
        //earlier
        Human personOne = new Human("Rick", 26);
        personOne.setName("Alis");
        personOne.setAge(22);
        Human personTwo = new Human();
    }
}
class Human{
    private String name;
    private int age;

    public Human(){
        System.out.println("From first constructor");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("From second constructor");
        this.name = name;
    }
    public Human(String name, int age){
        System.out.println("From third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Constructors
}