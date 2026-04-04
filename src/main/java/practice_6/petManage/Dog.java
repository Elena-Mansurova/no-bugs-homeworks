package practice_6.petManage;

public class Dog extends Pet{

    @Override
    public void interactWithOwner() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }
}
