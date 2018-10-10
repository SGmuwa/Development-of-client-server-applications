package ru.mirea.webPetShop.myPets.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.webPetShop.myPets.ServiceElements.Item;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items;

    public ItemService() {
        this.items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return new ArrayList<Item>(items);
    }

    public List<Item> getItems(int id) {
        return new ArrayList<Item>(() -> {return new ArrayList<Item>();});
    }
}

