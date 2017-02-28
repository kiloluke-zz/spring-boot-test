package com.visuu.test.dao;

import com.visuu.test.models.Category;

import java.util.List;

public interface CategoryDao {

    public void addCategory(Category category);
    public void editCategory(Category category);
    public void deleteCategory(int id);
    public Category getCategory(int id);
    public List getAllCategories();

}
