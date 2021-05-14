package eu.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author malwina.k on 14.05.2021
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
