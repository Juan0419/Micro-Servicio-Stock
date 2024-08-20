package com.demo.emazon.infrastructure.adapters.output;

import com.demo.emazon.domain.exception.Messages;
import com.demo.emazon.domain.model.Category;
import com.demo.emazon.domain.repository.CategoryPort;
import com.demo.emazon.infrastructure.exception.AlReadyExistsException;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class CategoryAdapter implements CategoryPort {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public void saveCategory(@NotNull Category category){
        if (categoryRepository.existsByName(category.getName())) {
            throw new AlReadyExistsException(Messages.categoryAlreadyExists.getMesssage());
        }
        categoryRepository.save(categoryMapper.toEntity(category));
    }
    @Override
    public boolean categoryExistsByName(String name){
        return categoryRepository.existsByName(name);
    }
}
