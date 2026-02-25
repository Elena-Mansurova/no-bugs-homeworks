package practice_4;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return r * r * PI;
    }
    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }
}
