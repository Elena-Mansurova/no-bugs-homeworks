package practice_6.zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.showBehavior();

        Animal bird = new Bird();
        zoo.addAnimal(bird);
        zoo.showBehavior();
    }
}
