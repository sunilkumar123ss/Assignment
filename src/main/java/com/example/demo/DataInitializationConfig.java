package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;




    @Configuration
    public class DataInitializationConfig {

        private final ItemRepository itemRepository;

        @Autowired
        public DataInitializationConfig(ItemRepository itemRepository) {
            this.itemRepository = itemRepository;
        }

        @PostConstruct
        public void init() {
            // Add some sample items during application startup
            Item item1 = new Item();
            item1.setName("Item 1");
            item1.setDescription("Description of Item 1");
            itemRepository.addItem(item1);

            Item item2 = new Item();
            item2.setName("Item 2");
            item2.setDescription("Description of Item 2");
            itemRepository.addItem(item2);

            
        }
    }


