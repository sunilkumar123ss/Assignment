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
    public Item getItemById(@PathVariable Long id) {
        return itemRepository.getItemById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemRepository.addItem(item);
    }
}
