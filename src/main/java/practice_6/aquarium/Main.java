package practice_6.aquarium;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();

        aquarium.addCreature(shark);
        aquarium.demonstrateCreaturesBehavior();

        SeaCreature starfish = new Starfish();

        aquarium.addCreature(starfish);
        aquarium.demonstrateCreaturesBehavior();
    }
}
