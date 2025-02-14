package guru.springframework.sfgpetclinic.Controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetContrller {

    private final VetService vetService;

    public VetContrller(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"vets","vets/vetIndex","/vets.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets",vetService.findAll());
        return "vets/vetIndex";
    }
}
