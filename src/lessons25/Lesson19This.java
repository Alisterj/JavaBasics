package lessons25;

public class Lesson19This {
    public static void main(String[] args) {
        HumanOne person = new HumanOne();
        person.setName("Alister");
        person.setAge(15);
        person.getInfo();

        ///////////////////////////////////////

        HumanOne personTwo = new HumanOne();
        personTwo.setName("Rem");
        personTwo.setAge(26);
        personTwo.getInfo();
    }
}
class HumanOne {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.printf("%s, %s%n", name, age);
    }
}