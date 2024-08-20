package com.demo.emazon.infrastructure.config;

import com.demo.emazon.aplication.mapper.CategoryMapper;
import com.demo.emazon.domain.repository.CategoryPort;
import com.demo.emazon.domain.services.CategoryCase;
import com.demo.emazon.infrastructure.adapters.output.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Bean
    public CategoryPort categoryPort(){
        return (CategoryPort) new CategoryCase(categoryPort());
    }
}
