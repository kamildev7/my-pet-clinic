package spring5test.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kamildev7 on 2018-08-06.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "vets/index", "/vets/index.html"})
    public String vetList() {
        return "vets/index";
    }
}
