package ru.mirea.webPetShop.myPets.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.webPetShop.myPets.ServiceElements.Balance;
import ru.mirea.webPetShop.myPets.ServiceElements.CartElement;
import ru.mirea.webPetShop.myPets.Services.BalanceService;
import ru.mirea.webPetShop.myPets.Services.CartService;
import ru.mirea.webPetShop.myPets.Services.CurrencyService;
import ru.mirea.webPetShop.myPets.Services.ItemService;

import java.util.List;

@Controller
public class CurrencyController {
    CurrencyService cs;
    BalanceService bs;
    CartService crs;
    ItemService is;

    @Autowired
    public CurrencyController(CurrencyService cs, BalanceService bs, CartService crs, ItemService is) {
        this.cs = cs;
        this.bs = bs;
        this.crs = crs;
        this.is = is;
    }

    @RequestMapping(value="currency/cart", method = RequestMethod.POST)
    @ResponseBody
    public boolean toPay(@RequestBody List<CartElement> ce) {
        return cs.toPay(bs, crs, is, 0);
    }
}
