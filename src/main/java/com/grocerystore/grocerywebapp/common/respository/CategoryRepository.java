package com.grocerystore.grocerywebapp.common.respository;

import com.grocerystore.grocerywebapp.common.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT id, departmentID, name, code from Category")
    List<Category> getAllCategories();

}
