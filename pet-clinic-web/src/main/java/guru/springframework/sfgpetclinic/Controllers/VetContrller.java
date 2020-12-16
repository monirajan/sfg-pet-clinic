package guru.springframework.sfgpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetContrller {

    @RequestMapping({"vets","vets/vetIndex"})
    public String listVets()
    {
        return "vets/vetIndex";
    }
}
