package practice_6.botanical_garden;

public class BotanicalGarden {

    Plant plant;

    public void addPlant(Plant p) {
        plant = p;
    }

    public void maintainPlant() {
        plant.care();
    }
}
