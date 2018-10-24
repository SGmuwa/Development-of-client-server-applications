package ru.mirea.webPetShop.myPets.Services;

import org.springframework.stereotype.Service;
import ru.mirea.webPetShop.myPets.ServiceElements.Balance;

@Service
public class BalanceService {
    Balance b;

    public BalanceService() {
        this.b = new Balance();
    }

    public long get() {
        return b.getPenny();
    }

    public void set(long l) {
        b.setPenny(l);
    }
}
