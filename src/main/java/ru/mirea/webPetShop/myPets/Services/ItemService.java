package ru.mirea.webPetShop.myPets.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.webPetShop.myPets.ServiceElements.Item;

import java.util.LinkedList;
import java.util.List;

import static ru.mirea.webPetShop.myPets.ServiceElements.Item.Types.*;

@Service
public class ItemService {

    private List<Item> items;

    @Autowired
    public ItemService() {
        this.items = new LinkedList<>();
    }

    public final List<Item> getItems() {
        return items;
    }

    public Item getItems(long id) {
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

    public Item getItems(long id, Item.Types type) {
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

    public Item getPets(long id) {
        return getItems(id, Pet);
    }

    public Item getStuffs(long id) {
        return getItems(id, Stuff);
    }

    public boolean addItem(Item item) {
        if(getItems(item.getId()) != null) return false;
        return items.add(item);
    }

    public boolean removeItem(long id) {
        return items.removeIf((it) -> it.getId() == id);
    }
}

