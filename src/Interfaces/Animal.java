package Interfaces;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleep");
    }

    @Override
    public void showInfo() {
        System.out.printf("My id is %s%n", this.id);
    }
}
