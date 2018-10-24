package ru.mirea.webPetShop.myPets.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.webPetShop.myPets.ServiceElements.CartElement;
import ru.mirea.webPetShop.myPets.ServiceElements.Item;
import ru.mirea.webPetShop.myPets.Services.CartService;
import ru.mirea.webPetShop.myPets.Services.ItemService;

import java.util.List;

@Controller
public class CartController {

    CartService cs;
    ItemService is;

    @Autowired
    public CartController(CartService cs, ItemService is) {
        this.cs = cs;
        this.is = is;
    }

    @RequestMapping(value="cart/item/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void putItem(int id) {
        cs.putItem(id, 0);
    }

    @RequestMapping(value="cart/pet/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void putPet(int id) {
        cs.putItem(id, 0);
    }

    @RequestMapping(value="cart/stuff/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void putStuff(int id) {
        cs.putItem(id, 0);
    }

    @RequestMapping(value="cart/item/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeItem(int id) {
        cs.removeItem(id);
    }

    @RequestMapping(value="cart/pet/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void removePet(int id) {
        cs.removeItem(id);
    }

    @RequestMapping(value="cart/item", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeItem() {
        cs.removeItem();
    }

    @RequestMapping(value="cart/pet", method = RequestMethod.DELETE)
    @ResponseBody
    public void removePet() {
        cs.removeItem();
    }

    @RequestMapping(value="cart/stuff", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeStuff() {
        cs.removeItem();
    }

    @RequestMapping(value="cart", method = RequestMethod.GET)
    @ResponseBody
    public List<CartElement> get() {
        return cs.getCart();
    }
}
