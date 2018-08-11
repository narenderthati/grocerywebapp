package com.grocerystore.grocerywebapp.common.service;


import com.grocerystore.grocerywebapp.common.model.Category;
import com.grocerystore.grocerywebapp.common.model.Department;
import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;

import java.util.List;

public interface AppService {

    List<AppMenu> getMenu();

    List<String> getSearchProductResults(String key);

    List<Category> getAllCategories();

    List<Department> getAllDepartments();
}
