package Lesson31;

//Приведение примитивных типов данных

import javax.swing.text.html.parser.Parser;

public class Test {
    public static void main(String[] args) {
        float f = 123.2F;

        int a = 123;

        //long l = 12358L;

        long l = a; // не явное приведение
        int x = (int) l; // явное приведение
        System.out.println(x);

        ////////////////////////////////////////

        int a1  = 123;
        double d = a1;

        ////Надо запомнить
        byte b = (byte) 129;
        System.out.println(b);
    }
}
