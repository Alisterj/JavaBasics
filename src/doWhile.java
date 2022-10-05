import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scannerData = new Scanner(System.in);
        System.out.println("Введите 5: ");
        int value = scannerData.nextInt();
        while (value!=5){
            System.out.println("Введите 5");
            value = scannerData.nextInt();
        }
        System.out.println("Вы ввели 5");

        //////////////////////////////////////////

        int valueTwo;
        do {
            System.out.println("Введи 7");
            valueTwo = scannerData.nextInt();
        } while (valueTwo!=7);
    }
}
