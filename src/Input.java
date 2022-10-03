import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //String s = new String("Fddfffjd");

        //String str = new String("adlg");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String str = s.nextLine();
        System.out.println("Введено: " + str);

        /////////////////////////////////////

        System.out.println("Введите число");
        int numbers = s.nextInt();
        System.out.println("введено: " + numbers);
    }
}
