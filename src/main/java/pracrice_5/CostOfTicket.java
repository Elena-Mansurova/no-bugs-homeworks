package pracrice_5;
import java.util.Scanner;

public class CostOfTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Стоимость билета 300 рублей");
        } else if (day == 6 || day == 7) {
            System.out.println("Стоимость билета 450 рублей");
        } else {
            System.out.println("Неверное значение");
        }
    }
}
