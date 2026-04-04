package practice_6.aquarium;

public class Aquarium {

    SeaCreature creature = new SeaCreature();

    public void addCreature(SeaCreature c) {
        creature = c;
    }

    public void demonstrateCreaturesBehavior() {
        creature.showBehavior();
    }
}
