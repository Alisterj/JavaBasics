package Draft;

public class SwitchCase {
    public static void main(String[] args) {
        int mark = 4;

        switch (mark) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 2, 1 -> System.out.println("Неудлетворительно");
            default -> System.out.println("You have error");
        }
    }
}
