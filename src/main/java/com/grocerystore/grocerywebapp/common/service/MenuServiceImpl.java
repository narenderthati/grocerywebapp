package com.grocerystore.grocerywebapp.common.service;

import com.grocerystore.grocerywebapp.common.modal.AppMenu;
import com.grocerystore.grocerywebapp.common.respository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<AppMenu> getMenu() {
        return menuRepository.findAll();
    }
}
