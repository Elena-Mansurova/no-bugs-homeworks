package practice_6.farm;

public class Farm {
    DomesticAnimal animal;

    public void addNewAnimal(DomesticAnimal a) {
        animal = a;
    }

    public void takeCareAboutAnimal() {
        animal.produce();
        animal.care();
        animal.feed();
    }
}
