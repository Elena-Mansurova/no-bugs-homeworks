package practice_2;

public class Main {
    public static void main(String[] args) {
        Student petya = new Student(18, "Petya");

        petya.printInfo();

        Student kolya = new Student(19, "Kolya");

        kolya.printInfo();

        petya.setName("Petr");
        petya.setAge(19);

        kolya.setName("Nikolay");
        kolya.setAge(20);

        petya.printInfo();
        kolya.printInfo();
    }
}
