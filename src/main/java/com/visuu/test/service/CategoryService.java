package com.visuu.test.service;

import com.visuu.test.models.Category;

import java.util.List;


public interface CategoryService {

    public void addCategory(Category category);
    public void editCategory(Category category);
    public void deleteCategory(int id);
    public Category getCategory(int id);
    public List getAllCategories();

}
