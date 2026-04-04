package practice_6.restaurantManage;

public class HotDish extends Dish{

    private int temp;

    public HotDish(int temp) {
        this.temp = temp;
    }

    @Override
    public void printInfo() {
        System.out.println("Горячее блюдо с температурой " + temp + " градусов.");
    }

}
