package com.demo.emazon.aplication.ports;


import com.demo.emazon.aplication.dto.CategoryRequest;
import com.demo.emazon.domain.model.Category;

public interface CategoryRepository {
    void saveCategory(CategoryRequest categoryRequest);
}
