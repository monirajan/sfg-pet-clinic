package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.*;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setPetName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Keerthi");
        owner1.setLastName("Vasan");
        owner1.setAddress("TamilNadu");
        owner1.setCity("Salem");
        owner1.setTelephone("123456789");
        ownerService.save(owner1);

        Pet vasanpet = new Pet();
        vasanpet.setName("Robert");
        vasanpet.setOwner(owner1);
        vasanpet.setPetType(savedDogType);
        vasanpet.setBirthDate(LocalDate.now());
        owner1.getPets().add(vasanpet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Abinila");
        owner2.setLastName("Raj");
        owner2.setAddress("TamilNadu");
        owner2.setCity("Bodi");
        owner2.setTelephone("982134567");
        ownerService.save(owner2);

        Pet abipet = new Pet();
        abipet.setName("Julie");
        abipet.setOwner(owner2);
        abipet.setPetType(savedCatType);
        abipet.setBirthDate(LocalDate.now());
        owner2.getPets().add(abipet);

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
