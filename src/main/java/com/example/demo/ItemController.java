package com.example.demo;

// ItemController.java
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable String id) {
        try {
            Long itemId = Long.parseLong(id);
            return itemRepository.getItemById(itemId);
        } catch (NumberFormatException e) {
            // Handle the case where id is not a valid Long value
            return null;
        }
    }


    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemRepository.addItem(item);
    }
}
