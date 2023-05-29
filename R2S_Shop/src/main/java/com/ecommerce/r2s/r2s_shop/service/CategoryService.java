package com.ecommerce.r2s.r2s_shop.service;

import com.ecommerce.r2s.r2s_shop.dto.CategoryDTO;
import com.ecommerce.r2s.r2s_shop.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();

    /*Customer*/
    List<CategoryDTO> getCategoryAndProduct();
}
