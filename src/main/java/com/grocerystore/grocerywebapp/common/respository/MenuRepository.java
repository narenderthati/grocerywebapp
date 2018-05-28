package com.grocerystore.grocerywebapp.common.respository;

import com.grocerystore.grocerywebapp.common.modal.AppMenu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<AppMenu, String> {
}
