package Draft2AboutOOP;

public class LessonEmployer {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.setName("Alisterj");
        employer.setAge(30);
        System.out.println(employer);
        employer.work();

        Employer employer1 = new Employer();
        employer1.setName("Nina");
        employer1.setAge(20);
        System.out.println(employer1);
        employer1.work();
    }
}
