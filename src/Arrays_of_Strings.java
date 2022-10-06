public class Arrays_of_Strings {
    public static void main(String[] args) {
        //Разница между ссылочными и примитивынми типами данных
        int[] numbers = new int[5]; //Числовой цикл
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3]; //Цикл строк
        strings[0] = "Hello";
        strings[1] = "Buy";
        strings[2] = "Java";

        System.out.println(strings[0]);
        System.out.println(strings[2] + '\n');

        //Рассмотрение циклов

        for (int i = 0; i < strings.length; i++)
            System.out.println(strings[i]);

        System.out.println();

        for (String string: strings)   //массив foreach
            System.out.println(string);

        //////////////////////////////////////////////

        int[] numbersTwo = {1, 2, 3};
        int sum = 0;
        for(int numb: numbersTwo)
            sum += numb;
        System.out.println(sum);


        ///Примитивы разница
        int value = 0; //выделяется память под целое число (int - 32 бита памяти)
        String ss; //память выделякется только под ссылку при декларировании переменной ss
        String s = "Alister"; //память выделяется под строку
    }
}
