package lessons25;

public class Lesson23Continued {
    public static void main(String[] args) {
        System.out.print("Alisterj");
        System.out.println("Alisterj again");
        System.out.printf("This is a string, %s%n","ARCHIE");
        //or
        System.out.printf("This is a number, %d%n",125);

        //Помимо обычной работы вставкой, можно и форматировать

        System.out.printf("String %10d \n", 566);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %10d \n", 56600000);
        System.out.printf("String %10d \n", 566000000);
        //для вещественных чисел
        //при работе с числами может округлять их
        System.out.printf("String %.2f \n", 32.9);
        System.out.printf("String %.2f \n", 32.917545);

        // % [10][-6][.11]
    }
}
