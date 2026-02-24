package pracrice_5;
import java.util.Scanner;

public class SaleForAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sale = scanner.nextInt();

        if (sale <= 18) {
            System.out.println("25%");
        } else if (sale >= 65) {
            System.out.println("30%");
        } else {
            System.out.println("0%");
        }

    }

}
