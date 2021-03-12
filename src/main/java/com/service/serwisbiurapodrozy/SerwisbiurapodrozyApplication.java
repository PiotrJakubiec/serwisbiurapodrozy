package com.service.serwisbiurapodrozy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
class MainController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
public String index(Model model){
    model.addAttribute("obj", new Object());
        return "index";
}

}

@SpringBootApplication
public class SerwisbiurapodrozyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SerwisbiurapodrozyApplication.class, args);
    }

}
