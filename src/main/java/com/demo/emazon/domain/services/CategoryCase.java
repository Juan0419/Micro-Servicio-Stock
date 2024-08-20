package com.demo.emazon.domain.services;

import com.demo.emazon.domain.api.CategoryServicePort;
import com.demo.emazon.domain.model.Category;
import com.demo.emazon.domain.repository.CategoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryCase implements CategoryServicePort {
    private final CategoryPort categoryPort;
    @Override
    public void saveCategory(Category category) {
        categoryPort.saveCategory(category);
    }
}
