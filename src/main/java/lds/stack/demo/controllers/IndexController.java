package lds.stack.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Creates it as a spring component and a controller
public class IndexController {

    @RequestMapping("/") //Thymeleaf will look for a file in templates called index.html
    public String getIndex(){


        return "index";
    }
}
