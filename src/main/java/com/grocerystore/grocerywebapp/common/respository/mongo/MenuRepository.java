package com.grocerystore.grocerywebapp.common.respository.mongo;

import com.grocerystore.grocerywebapp.common.model.mongo.AppMenu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<AppMenu, String> {
}
