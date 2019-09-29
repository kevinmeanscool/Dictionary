package com.example.spring.dictionary.Enum;

public enum CategoryEnum {
    TABLE("数据库表"),COLUNM("数据库字段");
    
    private String category;

    CategoryEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
