package practice_3;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("toyota", 1992);
        car1.print();
        car1.setYear(1995);
        car1.print();

        Rectangle rec1 = new Rectangle(4, 5);
        System.out.println(rec1.calculateArea());
        rec1.setWidth(1);
        System.out.println(rec1.calculateArea());

        Book book1 = new Book("Дюма", "Три мушкетера");
        book1.setAuthor("Александ Дюма");
        book1.printInfo();

        BankAccount johnSmith = new BankAccount("John Smith", 150000);
        johnSmith.deposit(800);
        johnSmith.printBalance();
        System.out.println(johnSmith.getBalance());
        johnSmith.withdraw(700);
        johnSmith.printBalance();
        System.out.println(johnSmith.getBalance());

        Point newPoint = new Point(10.25, 30.46);
        newPoint.print();
        newPoint.setX(44.25);
        newPoint.print();

        StudentGroup group1 = new StudentGroup("MathGroup", 18);
        group1.printInfo();
        group1.setStudentCount(22);
        group1.printInfo();

        Circle circle = new Circle(25.40);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
        circle.setRadius(80.25);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher teacher1 = new Teacher("Olga Ivanovna", "English");
        teacher1.printInfo();
        teacher1.setName("Inna Ivanovna");
        teacher1.setSubject("Russian");
        teacher1.printInfo();

        Product toothbrush = new Product("Colgate", 25.35);
        toothbrush.printInfo();
        toothbrush.setName("Rich");
        toothbrush.setPrice(30.29);
        toothbrush.printInfo();

        Laptop notebook = new Laptop("HP", 300.99);
        notebook.printInfo();
        notebook.setBrand("Asus");
        notebook.setPrice(400.99);
        notebook.printInfo();

    }

}
