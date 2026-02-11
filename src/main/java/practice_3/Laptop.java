package practice_3;

public class Laptop {
    private String brand;
    private double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand (String newBrand) {
        this.brand = newBrand;
    }

    void setPrice (double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("The laptpo is " + brand + ", the price is " + price);
    }
}
