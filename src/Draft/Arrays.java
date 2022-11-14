package Draft;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[10]; //создание массива
        arr[0] = 1;
        arr[1] = arr[2] = arr[3] = arr[0]++;

        for (int i = 4; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int a: arr) {   //цикл котрый используется для итерации по коллекциям
            System.out.println(a);
        }

        ////////////

        int number = 1;

        do {
            System.out.println("do-while: number = " + ++number);
        } while (number < 0);
        //or
        while (number > 0) {
            System.out.println("while: number = " + number--);
        }
    }
}
