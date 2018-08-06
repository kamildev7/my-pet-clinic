package spring5test.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring5test.mypetclinic.services.VetService;

/**
 * @author kamildev7 on 2018-08-06.
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "vets/index", "/vets/index.html"})
    public String vetList(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
