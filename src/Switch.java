import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = s.nextInt();

        switch (age){
            case 0 -> System.out.println("Начало");
            case 7 -> System.out.println("Школа");
            case 18 -> System.out.println("Школа закончилась");
            default -> System.out.println("Ни одно из начений не подошло");
        }

        /*switch (age){
            case 0:
                System.out.println("Начало");
                break;
            case 7:
                System.out.println("Школа");
                break;
            case 18:
                System.out.println("Школа закончилась");
                break;
            default:
                System.out.println("Ни одно из начений не подошло");
        }*/


        ///////////////////////////////////////////////////

        Scanner sStr = new Scanner(System.in);
        String ageStr = sStr.nextLine();
        switch (ageStr){
            case "Ноль" -> System.out.println("Начало");
            case "Семь" -> System.out.println("Школа");
            case "Восемнадцать" -> System.out.println("Школа закончилась");
            default -> System.out.println("Ни одно из начений не подошло");
        }
    }
}















