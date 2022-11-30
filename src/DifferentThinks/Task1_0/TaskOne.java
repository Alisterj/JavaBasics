package DifferentThinks.Task1_0;

import java.util.Scanner;

/*
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write count elements");
        int countElements = sc.nextInt();


        //double[] arr = new double[(int) (Math.random() * 19)];
        double[] arr = new double[countElements];
        if (arr.length == 0) {
            System.out.println("You don't have elements in array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.random();
            }

            MinMaxAverage minMaxAverage = new MinMaxAverage(arr[0], arr[0]);
            double average = 0;

            for (double el: arr) {
                System.out.println(el);
                minMaxAverage.changeVoid(el);
                average += el;
            }
            System.out.println("Min: " + minMaxAverage.getMin());
            System.out.println("Max: " + minMaxAverage.getMax());
            System.out.println("Average: " + average/arr.length);
        }
    }
}
