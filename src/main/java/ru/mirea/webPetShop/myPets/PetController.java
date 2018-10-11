package ru.mirea.webPetShop.myPets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.webPetShop.myPets.ServiceElements.Item;
import ru.mirea.webPetShop.myPets.Services.ItemService;

import java.util.List;

@Controller
public class PetController {

    private final ItemService p;

    @Autowired
    public PetController(ItemService p) {
        this.p = p;
    }

    @RequestMapping(value="pets", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getPets() {
        return p.getPets();
    }

    @RequestMapping(value="pets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Item getPets(int id) {
        return p.getPets(id);
    }

    @RequestMapping(value="items/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean removeItems(int id) {
        return p.removeItem(id);
    }

    @RequestMapping(value="items/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public boolean addItem(Item elm) {
        return p.addItem(elm);
    }

    @RequestMapping(value="items", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getItems() {
        return p.getItems();
    }

    @RequestMapping(value="helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "helloWorld";
    }
}
