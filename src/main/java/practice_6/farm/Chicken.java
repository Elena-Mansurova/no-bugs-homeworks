package practice_6.farm;

public class Chicken implements DomesticAnimal{

    @Override
    public void produce() {
        System.out.println("Курица несет яйца");
    }

    @Override
    public void care() {
        System.out.println("нуждается в кормушке");
    }

    @Override
    public void feed() {
        System.out.println("ест зерно");
    }

}
