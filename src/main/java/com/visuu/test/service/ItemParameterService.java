package com.visuu.test.service;

import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;

public interface ItemParameterService {

    public void setValue(Item item, Parameter parameter, String value);
    public String getValue(Item item, Parameter parameter);
    public void removeValue(Item item, Parameter parameter);
}
