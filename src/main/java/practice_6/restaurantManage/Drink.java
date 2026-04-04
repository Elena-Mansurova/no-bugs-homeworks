package practice_6.restaurantManage;

public class Drink extends Dish{

    private int volume;

    public Drink(int newVolume) {
        volume = newVolume;
    }

    @Override
    public void printInfo() {
        System.out.println("Напиток объемом " + volume + " мл.");
    }
}
