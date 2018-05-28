package com.grocerystore.grocerywebapp.admin.service;

import com.grocerystore.grocerywebapp.common.modal.AppMenu;

import java.util.List;

public interface AdminMenuService {

    void saveMenuList(List<AppMenu> menuList);

    void saveMenu(AppMenu appMenu);

}
