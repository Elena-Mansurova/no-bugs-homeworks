package practice_6.restaurantManage;

public class Menu {

    Dish newDish = new Dish();

    public void addDishToMenu(Dish dish){
        newDish = dish;
    }

    public void printDescription() {
        newDish.printInfo();
    }
}
