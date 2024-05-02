package SolidPrinciplesSW1;

public class Main {
    public static void main(String[] args) {
        Pet petName = new Pet("Kairo", "Steven");
        PetFood petFood = new PetFood();
        PetSound petSound = new PetSound();

        petFood.Food(petName, "Dog Food");
        petSound.makeSound(petName, "arf, arf");
    }
}
