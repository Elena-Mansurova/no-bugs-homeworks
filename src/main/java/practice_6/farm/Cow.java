package practice_6.farm;

public class Cow implements DomesticAnimal {

    @Override
    public void produce() {
        System.out.println("Корова дает молоко");
    }

    @Override
    public void care() {
        System.out.println("нуждается в выпасе");
    }

    @Override
    public void feed() {
        System.out.println("ест траву");
    }
}
