package com.visuu.test.controllers;

import com.visuu.test.models.Category;
import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;
import com.visuu.test.service.CategoryService;
import com.visuu.test.service.ItemParameterService;
import com.visuu.test.service.ItemService;
import com.visuu.test.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ItemParameterService itemParameterService;

    @Autowired
    private ParameterService parameterService;

    @RequestMapping("/")
    public String index() {
        return categoryService.getAllCategories().toString();
    }

    @RequestMapping("/all_items")
    public List allItems() {
        return itemService.getAllItems();
    }

    @RequestMapping("/{category}")
    public List getItemsFromCategory(@PathVariable Category category) {
        return itemService.getItemsFromCategory(category);
    }

    @RequestMapping("/{item}{action}")
    public void itemAction(@PathVariable Item item, @PathVariable String action) {
        switch (action) {
            case "add":
                itemService.addItem(item);
                break;
            case "edit":
                itemService.editItem(item);
                break;
            case "remove":
                itemService.deleteItem(item.getId());
                break;
        }
    }


    @RequestMapping("/{item}{parameter}{value}{action}")
    public void itemParameterAction(@PathVariable Item item,
                                    @PathVariable Parameter parameter,
                                    @PathVariable String value,
                                    @PathVariable String action) {

        switch (action) {
            case "add":
                itemParameterService.setValue(item, parameter, value);
                break;
            case "remove":
                itemParameterService.removeValue(item, parameter);
                break;
        }

    }

    @RequestMapping("/{item}{parameter}")
    public String getParameterValue(@PathVariable Item item,
                                    @PathVariable Parameter parameter) {

        return itemParameterService.getValue(item, parameter);


    }


    @RequestMapping("/{parameter}{action}")
    public void parameterAction(@PathVariable Parameter parameter,
                                    @PathVariable String action) {

        switch (action) {
            case "add":
                parameterService.addParameter(parameter);
                break;
            case "remove":
                parameterService.addParameter(parameter);
                break;
        }

    }

}
