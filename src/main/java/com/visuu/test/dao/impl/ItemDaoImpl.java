package com.visuu.test.dao.impl;


import com.visuu.test.dao.ItemDao;
import com.visuu.test.models.Category;
import com.visuu.test.models.Item;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addItem(Item item) {
        sessionFactory.getCurrentSession().save(item);
    }

    @Override
    public void editItem(Item item) {
        sessionFactory.getCurrentSession().update(item);
    }

    @Override
    public void deleteItem(int id) {
        sessionFactory.getCurrentSession().delete(getItem(id));
    }

    @Override
    public Item getItem(int id) {
        return (Item) sessionFactory.getCurrentSession().get(Item.class, id);
    }

    @Override
    public List getItemsFromCategory(Category category) {
        return sessionFactory.getCurrentSession().createQuery("from Item where category_id = " + category.getId()).list();

    }

    @Override
    public List getAllItems() {
        return sessionFactory.getCurrentSession().createQuery("from Item").list();
    }
}
