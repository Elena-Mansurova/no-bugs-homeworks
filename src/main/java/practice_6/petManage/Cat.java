package practice_6.petManage;

public class Cat extends Pet{

    @Override
    public void interactWithOwner() {
        System.out.println("Кошка играет");
    }

    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }
}
