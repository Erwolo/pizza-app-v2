package com.example.newpizzaapp.services;

import com.example.newpizzaapp.model.FoodCategory;

import java.util.List;
import java.util.Optional;

public interface FoodCategoryService {

    List<FoodCategory> getAllCategories();
    Optional<FoodCategory> getCategoryById(Long id);
    void saveCategory(FoodCategory foodCategory);
    void saveCategoryWithNextId(FoodCategory foodCategory);
    void removeCategoryById(Long id);
}
