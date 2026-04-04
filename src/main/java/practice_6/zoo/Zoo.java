package practice_6.zoo;

public class Zoo {
    Animal animal = new Animal();

    public void addAnimal(Animal a) {
        this.animal = a;
    }

    public void showBehavior() {
        animal.makeSound();
        animal.move();
    }
}
