package com.visuu.test.dao;

import com.visuu.test.models.Category;
import com.visuu.test.models.Item;

import java.util.List;


public interface ItemDao {
    public void addItem(Item item);
    public void editItem(Item item);
    public void deleteItem(int id);
    public Item getItem(int id);
    public List getItemsFromCategory(Category category);
    public List getAllItems();
}
