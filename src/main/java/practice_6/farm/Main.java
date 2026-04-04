package practice_6.farm;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();

        DomesticAnimal cow = new Cow();

        farm.addNewAnimal(cow);
        farm.takeCareAboutAnimal();

        DomesticAnimal chicken = new Chicken();

        farm.addNewAnimal(chicken);
        farm.takeCareAboutAnimal();
    }
}
