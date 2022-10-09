public class lesson19This {
    public static void main(String[] args) {
        Human person = new Human();
        person.setName("Alister");
        person.setAge(15);
        person.getInfo();

        ///////////////////////////////////////

        Human personTwo = new Human();
        personTwo.setName("Rem");
        personTwo.setAge(26);
        personTwo.getInfo();
    }
}
class Human{
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