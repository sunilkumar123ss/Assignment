package com.example.demo;

// ItemRepository.java
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {
    private final List<Item> items = new ArrayList<>();
    private Long nextId = 1L;

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null; // Return null if the item is not found
    }

    public void addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
    }
}
