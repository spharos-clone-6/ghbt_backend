package com.ghbt.ghbt_starbucks.category.repository;

import com.ghbt.ghbt_starbucks.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);

}
