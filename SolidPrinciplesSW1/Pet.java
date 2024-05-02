package SolidPrinciplesSW1;

public class Pet {
    private String petName;
    private String petOwner;

    public Pet(String petName, String petOwner) {
        this.petName = petName;
        this.petOwner = petOwner;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }
}