package ru.mirea.webPetShop.myPets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class petController {

    @Autowired
    private petService p;

    @RequestMapping(value="pet", method=RequestMethod.GET)
    @ResponseBody
    public List<Pet> pets() {
        return p.pets();
    }
}
