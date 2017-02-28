package com.visuu.test.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy="parameter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemParameter> item;
    private String parameter;

    public Parameter(List<ItemParameter> item, String parameter) {
        this.item = item;
        this.parameter = parameter;
    }

    public Parameter(String parameter) {
        this.parameter = parameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<ItemParameter> getItem() {
        return item;
    }

    public void setItem(List<ItemParameter> item) {
        this.item = item;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

}
