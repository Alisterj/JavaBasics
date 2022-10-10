public class Lesson20Constructors {
    public static void main(String[] args) {
        //earlier
        HumanTwo personOne = new HumanTwo("Rick", 26);
        personOne.setName("Alis");
        personOne.setAge(22);
        HumanTwo personTwo = new HumanTwo();

        //Human.toStudent(personOne, 5);

        String commonName = HumanTwo.COMMON_NAME;
    }
}
class HumanTwo {
    public static String COMMON_NAME = "Als";

    private String name;
    private int age;

    public HumanTwo(){
        System.out.println("From first constructor");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public HumanTwo(String name){
        System.out.println("From second constructor");
        this.name = name;
    }
    public HumanTwo(String name, int age){
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

    /*public static Student toStudent(int grade) {
        return new Student(grade, name, age);
    }*/

    //Constructors
}

class Student{
    private final int grade;

    private final String name;
    private final int age;

    public Student(int grade, String name, int age) {
        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}