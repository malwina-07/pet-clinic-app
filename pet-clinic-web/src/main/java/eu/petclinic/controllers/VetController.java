package eu.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author malwina.k on 14.05.2021
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
