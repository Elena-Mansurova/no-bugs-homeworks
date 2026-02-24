package pracrice_5;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
           sum = sum + i;
        } System.out.println(sum);


    }
}
