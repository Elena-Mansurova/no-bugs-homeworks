package practice_4;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {

        Company employee1 = new Company(1000, "Smith");
        Company employee2 = new Company(1001, "Bill");
        Company employee3 = new Company(1002, "Duck");

        Company.companyName = "Sony";
        Company.printCompaneName();
        System.out.println(employee2.employeeID);
        // employee2.employeeID = 2000;

        // вызов методов класса MathConstants

        MathConstants.calculateCircleArea(10);
        MathConstants.calculateCircleArea(20);
        MathConstants.calculateCircumference(8);
        MathConstants.calculateCircumference(10);

        System.out.println("------------------------------");

        University stud1 = new University(1, "Mick");
        University stud2 = new University(2, "Bob");
        University stud3 = new University(14, "Ricky");

        University.changeUniversityName("MIT");
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

        System.out.println("------------------------------");

        GameSettings game1 = new GameSettings("WoW");
        GameSettings game = new GameSettings("Sims");
        GameSettings.setMaxPlayers(2);
        game1.addPlayers();
        game.addPlayers();
        game1.printGameStatus();
        game.printGameStatus();
        game1.addPlayers();
        game.addPlayers();
        game1.printGameStatus();
        game.printGameStatus();
        game1.addPlayers();
        game.addPlayers();
        game1.printGameStatus();
        game.printGameStatus();

        System.out.println("------------------------------");

        Person person1 = new Person("Bob", "Smith", "155-255-899");
        Person person2 = new Person("Jack", "Gold", "200-798-658");
        Person person3 = new Person("Anna", "Wens", "789-984-562");

        person1.setFirstName("Mick");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }

}
