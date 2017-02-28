package com.visuu.test.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item_parameter")
public class ItemParameter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn(name = "parameter_id")
    private Parameter parameter;

    @Column(name = "value")
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemParameter(Item item, Parameter parameter) {
        this.item = item;
        this.parameter = parameter;
    }

    public ItemParameter(Item item, Parameter parameter, String value) {
        this.item = item;
        this.parameter = parameter;
        this.value = value;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }



    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}

