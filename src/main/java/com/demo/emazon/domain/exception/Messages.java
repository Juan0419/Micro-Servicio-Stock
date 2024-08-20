package com.demo.emazon.domain.exception;

public enum Messages {
    categoryAlreadyExists("Category Exist"),
    categoryNameRequired("All Categories Have A Name"),
    categoryNameLength("Name Must Be Less Than Or Equal To 50 Characters"),
    categoryDescriptionRequired("All Categories Have A Description"),
    categoryDescriptionLength("Description Must Be Less Than Or Equal To 90 Characters");

    public String getMesssage() {
        return messsage;
    }

    private final String messsage;

    Messages(String messsage) {
        this.messsage = messsage;
    }
}
