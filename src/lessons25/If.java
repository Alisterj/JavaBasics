package lessons25;

public class If {
    public static void main(String[] args) {
        int myInt = 19;
        if (myInt<10)
            System.out.println(myInt + " is less 10");
        else if (myInt>20)
            System.out.println(myInt + " is more 20");
        else
            System.out.println("Ни один из случаев не сработал");
    }
}
