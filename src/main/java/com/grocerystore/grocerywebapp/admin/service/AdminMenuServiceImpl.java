package com.grocerystore.grocerywebapp.admin.service;


import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;
import com.grocerystore.grocerywebapp.common.respository.mongo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminMenuServiceImpl implements AdminMenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public void saveMenuList(List<AppMenu> menuList) {
        menuRepository.saveAll(menuList);
    }

    @Override
    public void saveMenu(AppMenu appMenu) {
        menuRepository.save(appMenu);
    }
}
