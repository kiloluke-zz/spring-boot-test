package com.visuu.test.service.impl;

import com.visuu.test.dao.ItemParameterDao;
import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;
import com.visuu.test.service.ItemParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class ItemParameterServiceImpl implements ItemParameterService {

    @Autowired
    private ItemParameterDao itemParameterDao;


    @Transactional
    public void setValue(Item item, Parameter parameter, String value) {
        itemParameterDao.setValue(item, parameter, value);
    }

    @Transactional
    public String getValue(Item item, Parameter parameter) {
        return itemParameterDao.getValue(item, parameter);
    }

    @Transactional
    public void removeValue(Item item, Parameter parameter) {
        itemParameterDao.removeValue(item, parameter);
    }
}
