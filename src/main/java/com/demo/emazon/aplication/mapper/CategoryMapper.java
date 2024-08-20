package com.demo.emazon.aplication.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import com.demo.emazon.aplication.dto.CategoryRequest;
import com.demo.emazon.domain.model.Category;
import org.springframework.context.annotation.Primary;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Primary
public interface CategoryMapper {
    Category categoryRequestToCategory(CategoryRequest categoryRequest);
}
