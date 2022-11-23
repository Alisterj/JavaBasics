package Lesson32;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x);

        Integer x2 = 123;
        String str1 = new String("222");
        //Пометочка
        //Классы Integer,  String ... по умолчанию встроены в java
        //И лежат в пакете java.lang
        //И как известно доступны по умолчанию - без импорта
        Integer.parseInt("123");
    }
}
