package pracrice_5;
import java.util.Scanner;

public class GradeFromOneToFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;

            case 4:
                System.out.println("Хорошо");
                break;

            case 3:
                System.out.println("Удовлетворительно");
                break;

            case 2:
                System.out.println("Неудовлетворительно");
                break;

            case 1:
                System.out.println("Неудовлетворительно");
                break;

            default:
                System.out.println("Неверное значение");
        }
    }
}
