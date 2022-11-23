package Lesson35;

public class Animal {
    private int id;
    private String name;

    public Animal() {
    }
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
