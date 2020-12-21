package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.Map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.Map.VetServiceMap;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
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
