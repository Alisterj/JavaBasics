//более глубокое изучение строк
//тип данных string - immutable
public class Lesson23StringBuilder {
    public static void main(String[] args) {
        String x = "Alister";
        //x.toUpperCase(); //так нельзя
        x = x.toUpperCase();
        System.out.println(x);
        //сборщик мусора - удаляет несипользуемые объекты

        ///////////////////////////////

        String stringOne = "Alisterj";
        String stringTwo = " My";
        String stringThree = " Friend";
        String stringAll = stringOne + stringTwo + stringThree;

        System.out.println(stringAll);

        //////////////////////////////////////

        StringBuilder sb = new StringBuilder("Alisterj");
        System.out.println(sb.toString());
        /*sb.append(" My");
        sb.append(" Friend");*/
        //or
        sb.append(" My").append(" Friend");
        System.out.println(sb.toString());
    }
}
