package ru.mirea.webPetShop.myPets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class petController {

    private final petService p;

    public petController(petService p) {
        this.p = p;
    }

    @Autowired
    public petController() {
        this.p = new petService();
    }

    @RequestMapping(value="pet", method = RequestMethod.GET)
    @ResponseBody
    public List<Pet> pets() {
        return p.pets();
    }

    @RequestMapping(value="helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "helloWorld";
    }
}
