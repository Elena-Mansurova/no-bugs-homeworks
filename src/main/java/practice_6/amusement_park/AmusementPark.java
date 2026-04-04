package practice_6.amusement_park;

public class AmusementPark {

    Attraction attraction;

    public void setAttraction(Attraction attr) {
        attraction = attr;
    }

    public void printInfo() {
        System.out.print("Этот аттракцион - ");
        attraction.info();
    }

    public void operateAttraction() {
        System.out.print("Этот аттракцион - ");
        attraction.maintain();
    }
}
