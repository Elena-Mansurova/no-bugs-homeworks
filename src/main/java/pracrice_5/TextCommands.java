package pracrice_5;
import java.util.Scanner;

public class TextCommands {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command) {

            case "start":
                System.out.println("Система запущена");
                break;

            case "stop":
                System.out.println("Система остановлена");
                break;

            case "restart":
                System.out.println("Система перезапущена");
                break;

            case "status":
                System.out.println("Проверка статуса");
                break;

            default:
                System.out.println("Неверное значение");
        }
    }
}
