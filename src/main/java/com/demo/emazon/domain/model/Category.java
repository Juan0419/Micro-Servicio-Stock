package com.demo.emazon.domain.model;

import com.demo.emazon.domain.exception.Messages;

public class Category {

    public Category(Long id, String name, String description) {
        validateName(name);
        validateDescription(description);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private void validateName(String categoryName) {
        if (categoryName == null ||categoryName.trim().isBlank()) throw new IllegalArgumentException(Messages.categoryNameRequired.getMesssage());
        if (categoryName.length() > maxName ) throw new IllegalArgumentException(Messages.categoryNameRequired.getMesssage());
    }

    private void validateDescription(String categoryDescription) {
        if(categoryDescription == null || categoryDescription.trim().isBlank()) throw new IllegalArgumentException(Messages.categoryNameLength.getMesssage());
        if (categoryDescription.trim().length() > maxDescription) throw new IllegalArgumentException(Messages.categoryDescriptionRequired.getMesssage());

    }

    private static final int maxName = 50;
    private static final int maxDescription = 90;
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
