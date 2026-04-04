package practice_6.amusement_park;

public class Main {
    public static void main(String[] args) {

        AmusementPark park = new AmusementPark();

        Attraction rollerCoaster = new RollerCoaster();

        park.setAttraction(rollerCoaster);
        park.printInfo();
        park.operateAttraction();

        Attraction carousel = new Carousel();

        park.setAttraction(carousel);
        park.printInfo();
        park.operateAttraction();
    }
}
