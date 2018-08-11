package com.grocerystore.grocerywebapp.admin;

import com.grocerystore.grocerywebapp.admin.service.AdminMenuService;
import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gwa/admin")
public class AdminController {


    @Autowired
    AdminMenuService menuService;

    @PutMapping("/savemenulist")
    public ResponseEntity<Void> saveMenu(@RequestBody List<AppMenu> menuList){
        menuService.saveMenuList(menuList);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/savemenu")
    public ResponseEntity<Void> saveMenu(@RequestBody AppMenu appMenu){
        menuService.saveMenu(appMenu);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
