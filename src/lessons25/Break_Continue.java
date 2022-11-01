package lessons25;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i == 15)
                break;
            System.out.println(i);
            i++;
        }
        System.out.println("Конец цилка");

        ////////////////////////////////////////

        for (int t = 0; t <= 15; t++){
            if (t % 2 == 0)
                continue;
            System.out.println(t);
        }
    }
}
