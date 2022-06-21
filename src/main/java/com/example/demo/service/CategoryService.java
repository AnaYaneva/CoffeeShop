package com.example.demo.service;

import com.example.demo.model.entity.CategoryEntity;
import com.example.demo.model.entity.CategoryNameEnum;
import com.example.demo.repository.CategotyRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryService {

    private final CategotyRepository categotyRepository;

    public CategoryService(CategotyRepository categotyRepository) {
        this.categotyRepository = categotyRepository;
    }


    public void initCategories() {
        if (categotyRepository.count() !=0){
            return;
        }

        Arrays.stream(CategoryNameEnum.values())
                .forEach(categoryNameEnum -> {
                    CategoryEntity category = new CategoryEntity();
                    category.setName(categoryNameEnum);
                    switch (categoryNameEnum){
                        case CAKE -> category.setNeededTime(10);
                        case DRINK -> category.setNeededTime(1);
                        case COFFEE -> category.setNeededTime(2);
                        case OTHER -> category.setNeededTime(5);
                    }

                    categotyRepository.save(category);
        });
    }

    public CategoryEntity findByCategoryNameEnum(CategoryNameEnum categoryNameEnum) {
        return categotyRepository.findByName(categoryNameEnum).orElse(null);
    }
}
