package lessons25;

public class Animal {

    /*Animal animal1 = new Animal(1);
        Person person1 = new Person("Alisterj");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();*/
    private String name = "Some animal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("I'm eating");
    }
    public void sleep() {
        System.out.println("I'm sleeping");
    }
}
