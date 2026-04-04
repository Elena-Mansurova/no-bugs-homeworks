package practice_6.petManage;

public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner();
        Pet dog = new Dog();

        owner.addPet(dog);
        owner.interactWithPet();

        Pet cat = new Cat();
        owner.addPet(cat);
        owner.interactWithPet();
    }



}
