package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{
    String petName;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
