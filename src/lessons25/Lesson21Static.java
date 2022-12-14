package lessons25;

public class Lesson21Static {
    public static void main(String[] args) {
        /*Human.description = "FFFf";
        Human.getDescription();*/

        /*Human personOne = new Human("Alister", 23);
        Human personTwo = new Human("Rick", 36);

        Human.description = "LLLLl";
        personOne.getAllField();
        personTwo.getAllField();

        Human.description = "ffff";
        personOne.getAllField();
        personTwo.getAllField();*/

        /*Math.pow(2, 4);
        System.out.println(Math.PI);*/

        HumanThree personOne = new HumanThree("Alister", 23);
        HumanThree personTwo = new HumanThree("Rick", 36);

        personOne.printNumberOfPeople();
        personTwo.printNumberOfPeople();

        HumanThree personThree = new HumanThree("Rick", 36);
        personOne.printNumberOfPeople();
        personTwo.printNumberOfPeople();
        personThree.printNumberOfPeople();
    }
}

class HumanThree {
    private String name;
    private int age;
    public static String description;
    private static int countPeople;

    public HumanThree() {
        this("Bob", 12);
    }

    public HumanThree(String name) {
        System.out.println("Второй конструктор");
        this.name = name;
    }

    public HumanThree(String name, int age) {
        System.out.println("Третий конструктор");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public void getAllField() {
        System.out.printf("%s, %s, %s, %s.%n", name, age, description, countPeople);
    }*/
    public void printNumberOfPeople() {
        System.out.printf("Number of people is %s.%n", countPeople);
    }
}