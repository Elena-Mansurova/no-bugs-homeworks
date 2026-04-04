package practice_6.restaurantManage;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Dish soup = new HotDish(45);

        menu.addDishToMenu(soup);
        menu.printDescription();

        Dish drink = new Drink(350);

        menu.addDishToMenu(drink);
        menu.printDescription();
    }
}
