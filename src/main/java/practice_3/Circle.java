package practice_3;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    double calculateAres() {
        return Math.PI * (radius * radius);
    }
    double cakculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
