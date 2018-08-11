package com.grocerystore.grocerywebapp.common;

import com.grocerystore.grocerywebapp.common.model.Category;
import com.grocerystore.grocerywebapp.common.model.Department;
import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;
import com.grocerystore.grocerywebapp.common.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gwa/")
@CrossOrigin
public class MainController{

    @Autowired
    AppService appService;

    @GetMapping("/appmenu")
    public List<AppMenu> getMenu(){
        return appService.getMenu();
    }

    @GetMapping("/searchproduct")
    public List<String> getSearchProductResults(@RequestParam String key){
        return appService.getSearchProductResults(key);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return appService.getAllCategories();
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return appService.getAllDepartments();
    }
}
