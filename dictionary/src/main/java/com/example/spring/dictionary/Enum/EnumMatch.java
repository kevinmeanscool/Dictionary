package com.example.spring.dictionary.Enum;

public class EnumMatch {
    public static Number matchCategoryEnum(String category){
        Number index = -1;
        for(CategoryEnum categoryEnum:CategoryEnum.values()){
            if(categoryEnum.getCategory().equals(category)){
                index = categoryEnum.ordinal();
            }
        }
        return index;
    }
}
