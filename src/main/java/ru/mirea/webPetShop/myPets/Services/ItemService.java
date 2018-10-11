package ru.mirea.webPetShop.myPets.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.webPetShop.myPets.ServiceElements.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static ru.mirea.webPetShop.myPets.ServiceElements.Item.Types.*;

@Service
public class ItemService {

    private List<Item> items;

    public ItemService() {
        this.items = new LinkedList<>();
    }

    public final List<Item> getItems() {
        return items;
    }

    public Item getItems(int id) {
        for(Item it : getItems())
            if(it.getId() == id)
                return it;
        return null;
    }

    public final List<Item> getItems(Item.Types type) {
        List<Item> out = new LinkedList<>();
        for(Item it : getItems())
            if(it.getType() == type)
                out.add(it);
        return out;
    }

    public Item getItems(int id, Item.Types type) {
        Item out = getItems(id);
        if(out == null) return null;
        if(out.getType().equals(type))
            return out;
        return null;
    }

    public final List<Item> getPets() {
        return getItems(Pet);
    }

    public final List<Item> getStuffs() {
        return getItems(Stuff);
    }

    public Item getPets(int id) {
        return getItems(id, Pet);
    }

    public Item getStuffs(int id) {
        return getItems(id, Stuff);
    }

    public boolean addItem(Item item) {
        if(getItems(item.getId()) != null) return false;
        return items.add(item);
    }
}

