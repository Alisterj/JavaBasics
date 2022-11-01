package lessons25;

public class Lesson24ClassObjectAndToString {
    public static void main(String[] args) {
        String str = "Alisterj";
        System.out.println(str);
        //создание объекта + попытка произвести печать
        HumanFour24 h = new HumanFour24("Alisterj", 24);
        System.out.println(h);
        //System.out.println(h.toString()); верхнее тоже самое
    }
}
class HumanFour24 {
    private String name;
    private int age;

    public HumanFour24(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return new StringBuilder(name).append(", ").append(age).toString();
    }
}
