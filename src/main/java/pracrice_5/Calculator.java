package pracrice_5;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        int num2 = scanner.nextInt();

        String operator = scanner.next();

        switch (operator) {

            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Неверно введен математический оператор");


        }

    }
}
