package hasrelationshipaggregtion;

public class MainWorking {



    public static void main(String[] args) {

        Laptop dell = new Laptop("Dell", 16, 50000);
        Laptop hp = new Laptop("HP", 8, 40000);

        Student soham = new Student(1, "Soham", 88, hp);
        Student rahul = new Student(2, "Rahul", 78, hp);

        soham.study();
        rahul.study();
    }
}
