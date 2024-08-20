package com.demo.emazon.domain.repository;

import com.demo.emazon.domain.model.Category;

public interface CategoryPort {
    void saveCategory(Category category);

    boolean categoryExistsByName(String name);
}
