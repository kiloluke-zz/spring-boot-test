package com.visuu.test.dao;

import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;

import java.util.List;


public interface ItemParameterDao {

    public void setValue(Item item, Parameter parameter, String value);
    public String getValue(Item item, Parameter parameter);
    public void removeValue(Item item, Parameter parameter);

}
