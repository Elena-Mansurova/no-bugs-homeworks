package practice_6.botanical_garden;

public class Main {
    public static void main(String[] args) {

        BotanicalGarden garden = new BotanicalGarden();

        Plant plant1 = new Cactus();

        garden.addPlant(plant1);
        garden.maintainPlant();

        Plant plant2 = new Orchid();

        garden.addPlant(plant2);
        garden.maintainPlant();
    }
}
