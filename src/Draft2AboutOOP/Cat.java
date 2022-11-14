package Draft2AboutOOP;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void jump() {
        System.out.println("Jump-Jump");
    }
}

