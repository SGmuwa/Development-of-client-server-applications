package ru.mirea.webPetShop.myPets.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.webPetShop.myPets.Services.BalanceService;

@Controller
public class BalanceController {

    BalanceService bs;

    @Autowired
    public BalanceController(BalanceService bs) {
        this.bs = bs;
    }

    @RequestMapping(value="balance", method = RequestMethod.GET)
    @ResponseBody
    public long getBalance() {
        return bs.get();
    }
}
