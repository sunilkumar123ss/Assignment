package com.example.demo;


public class Item {
    private Long id;
    private String name;
    private String description;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public  Item() {

    }

    // Parameterized constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;

    }
}