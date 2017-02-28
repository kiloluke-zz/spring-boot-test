package com.visuu.test.service.impl;

import com.visuu.test.dao.CategoryDao;
import com.visuu.test.models.Category;
import com.visuu.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Transactional
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Transactional
    public void editCategory(Category category) {
        categoryDao.editCategory(category);
    }

    @Transactional
    public void deleteCategory(int id) {
        categoryDao.deleteCategory(id);
    }

    @Transactional
    public Category getCategory(int id) {
        return categoryDao.getCategory(id);
    }

    @Transactional
    public List getAllCategories() {
        return categoryDao.getAllCategories();
    }
}
