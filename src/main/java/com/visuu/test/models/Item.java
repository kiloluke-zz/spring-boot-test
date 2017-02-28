package com.visuu.test.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column
    private boolean status;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemParameter> parameters;

    public Item(){}

    public Item(String brand, String model, boolean status, Category category, List<ItemParameter> parameters) {
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.category = category;
        this.parameters = parameters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public List<ItemParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<ItemParameter> parameters) {
        this.parameters = parameters;
    }
}
