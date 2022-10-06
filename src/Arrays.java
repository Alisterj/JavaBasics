public class Arrays {
    public static void main(String[] args) {
        int number = 10; //примитива
        char character = 'a';
        String s = "Hey";
        //OR
        String s1 = new String("Alisterj");

        //////////////////////////////////////////////////////

        int[] numbers = new int[5];
        //System.out.println(numbers[0]);
        //инициализация элементов массива
        numbers[0] = 10;
        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 10;
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        /////////////////////////////////////////////////


        int[] numbersTwo = {1, 2, 3};
        for (int i = 0; i < numbersTwo.length; i++)
            System.out.println(numbersTwo[i]);
    }
}
