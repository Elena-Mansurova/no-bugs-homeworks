package pracrice_5;
import java.util.Scanner;
public class CheckOddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
         if (num % 2 == 0) {
             System.out.println("Четное");
         } else {
             System.out.println("Нечетное");
         }
    }
}
