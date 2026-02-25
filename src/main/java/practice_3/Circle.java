package practice_3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
