package com.grocerystore.grocerywebapp.common.respository;

import com.grocerystore.grocerywebapp.common.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query(value = "SELECT id, name, code from Department")
    List<Department> getAllDepartments();
}
