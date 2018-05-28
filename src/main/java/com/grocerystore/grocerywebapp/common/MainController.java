package com.grocerystore.grocerywebapp.common;

import com.grocerystore.grocerywebapp.common.modal.AppMenu;
import com.grocerystore.grocerywebapp.common.service.MenuService;
import com.grocerystore.grocerywebapp.common.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gwa/")
@CrossOrigin
public class MainController{

    @Autowired
    MenuService menuService;

    @GetMapping("/appmenu")
    public List<AppMenu> getMenu(){
        return menuService.getMenu();
    }

}
