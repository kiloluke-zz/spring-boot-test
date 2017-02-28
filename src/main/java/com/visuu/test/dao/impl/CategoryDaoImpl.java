package com.visuu.test.dao.impl;


import com.visuu.test.dao.CategoryDao;
import com.visuu.test.models.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCategory(Category category) {
        sessionFactory.getCurrentSession().save(category);
    }

    @Override
    public void editCategory(Category category) {
        sessionFactory.getCurrentSession().update(category);
    }

    @Override
    public void deleteCategory(int id) {
        sessionFactory.getCurrentSession().delete(getCategory(id));
    }

    @Override
    public Category getCategory(int id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    @Override
    public List getAllCategories() {
        return sessionFactory.getCurrentSession().createQuery("from Category").list();
    }
}
