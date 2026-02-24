package pracrice_5;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        String operator = scanner3.nextLine();

        switch (operator) {

            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);

            case "*":
                System.out.println(num1 * num2);

            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                }
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Неверно введен математический оператор");


        }

    }
}
