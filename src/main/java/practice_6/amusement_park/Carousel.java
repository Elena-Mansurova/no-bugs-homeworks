package practice_6.amusement_park;

public class Carousel extends Attraction {

    @Override
    public void info() {
        System.out.println("спокойный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("техническое обслуживание");
    }
}
