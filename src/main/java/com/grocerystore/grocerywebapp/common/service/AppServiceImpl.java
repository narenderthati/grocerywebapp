package com.grocerystore.grocerywebapp.common.service;


import com.grocerystore.grocerywebapp.common.model.Category;
import com.grocerystore.grocerywebapp.common.model.Department;
import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;
import com.grocerystore.grocerywebapp.common.respository.CategoryRepository;
import com.grocerystore.grocerywebapp.common.respository.DepartmentRepository;
import com.grocerystore.grocerywebapp.common.respository.mongo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<AppMenu> getMenu() {
        return menuRepository.findAll();
    }

    @Override
    public List<String> getSearchProductResults(String key) {

        List<String>  searchProducts = Arrays.asList("product","grocery","oil");
        if(key.isEmpty()){
            searchProducts = new ArrayList<>();
        }

        return searchProducts;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }
}
