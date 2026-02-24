package pracrice_5;
import java.util.Scanner;

public class CountingOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int i = 0;

        do {
            num = num / 10;
            i++;
        } while (num > 0);

        System.out.println("quantity of nembers: " + num);

    }

}
