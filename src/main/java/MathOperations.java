public class MathOperations {

            static int add(int x, int y) {
                return x + y;
    }

    static int substract(int x, int y){
        return x - y;
    }

    static int multiply(int x, int y){
        return x * y;
    }

    static double devide(int x, int y){
        return (double) x / y;
    }

    static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    static int difference(int a, int b) {
        return Math.abs(a - b);
    }

    static int squareArea (int side) {
        return side * side;
    }
    static int squarePerimeter(int side) {
        return side * 4;
    }

    static double sconvertSecondsToMinute(int seconds) {
        return (double) seconds / 60;
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    static double finaHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        System.out.println("Method celsiusToFahrenheit: " + celsiusToFahrenheit(36.7));
        System.out.println("Method fahrenheitToCelsius: " + fahrenheitToCelsius(450.30));
        System.out.println("Результат суммы: " + add(2, 5));
        System.out.println("Результат вычитания: " + substract(5, 4));
        System.out.println("Результат произведения : " + multiply(50, 2));
        System.out.println("Результат деления: " + devide(5, 2));
        System.out.println("Method findMax: " + findMax(10, 6));
        System.out.println("Method difference: " + difference(50, 30));
        System.out.println("Method squareArea: " + squareArea(20));














        System.out.println("Method squarePerimeter: " + squarePerimeter(10));
        System.out.println("Method conver to minutes: " + sconvertSecondsToMinute(260));
        System.out.println("Method speed: " + averageSpeed(165.5, 2.5));
        System.out.println("Method fainHypotenuse: " + finaHypotenuse(2, 3));
        System.out.println("Method circleCircumference: " + circleCircumference(4));
        System.out.println("Method calculatePercentage: " + calculatePercentage(100.25, 0.25));

    }
}
