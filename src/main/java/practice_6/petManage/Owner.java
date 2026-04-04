package practice_6.petManage;

public class Owner {

    Pet pet = new Pet();

    public void addPet(Pet p) {
        this.pet = p;
    }

    public void interactWithPet() {
        pet.interactWithOwner();
        pet.feed();
    }
}
