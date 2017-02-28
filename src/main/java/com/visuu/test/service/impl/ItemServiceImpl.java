package com.visuu.test.service.impl;

import com.visuu.test.dao.ItemDao;
import com.visuu.test.models.Category;
import com.visuu.test.models.Item;
import com.visuu.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;
    
    
    
    @Transactional
    public void addItem(Item item) {
        itemDao.addItem(item);
    }

    @Transactional
    public void editItem(Item item) {
        itemDao.editItem(item);
    }

    @Transactional
    public void deleteItem(int id) {
        itemDao.deleteItem(id);
    }

    @Transactional
    public Item getItem(int id) {
        return itemDao.getItem(id);
    }

    @Override
    public List getItemsFromCategory(Category category) {
        return itemDao.getItemsFromCategory(category);
    }

    @Transactional
    public List getAllItems() {
        return itemDao.getAllItems();
    }
}
