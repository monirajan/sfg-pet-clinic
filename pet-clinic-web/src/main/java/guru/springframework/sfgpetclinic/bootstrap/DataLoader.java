package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setPetName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Keerthi");
        owner1.setLastName("Vasan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Abinila");
        owner2.setLastName("Raj");
        ownerService.save(owner2);

        System.out.println("Owners loaded!!!!");

        Vet vet1 = new Vet();
        vet1.setFirstName("Priyanka");
        vet1.setLastName("Singer");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Prabhu");
        vet2.setLastName("Deva");
        vetService.save(vet2);

        System.out.println("Vet loaded!!!!");
    }
}
