package com.demo.emazon.aplication.ports;

import com.demo.emazon.aplication.dto.CategoryRequest;
import com.demo.emazon.aplication.mapper.CategoryMapper;
import com.demo.emazon.domain.api.CategoryServicePort;
import com.demo.emazon.domain.model.Category;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
@Transactional
public class CategoryRepositoryC implements CategoryRepository{
    private final CategoryServicePort categoryServicePort;
    private final CategoryMapper categoryMapper;

    @Override
    public void saveCategory(CategoryRequest categoryRequest) {
        Category category = categoryMapper.categoryRequestToCategory(categoryRequest);
        categoryServicePort.saveCategory(category);

    }
}
