package practice_6.amusement_park;

public class RollerCoaster extends Attraction{

    @Override
    public void info() {
        System.out.println("острые ощущения");
    }

    @Override
    public void maintain() {
        System.out.println("проверка безопасности");
    }
}
