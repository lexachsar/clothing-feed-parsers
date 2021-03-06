package com.lexach.clothing.feed.parsers.service.impl;

import com.lexach.clothing.feed.parsers.model.ProductCategory;
import com.lexach.clothing.feed.parsers.repository.ProductCategoryRepository;
import com.lexach.clothing.feed.parsers.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl() {
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {

        // TODO add conversion

        // TODO add validation

        // Saves product into repository
        return productCategoryRepository.save(productCategory);

    }

    @Override
    public ProductCategory getOrCreate(ProductCategory productCategoryParam) {
        ProductCategory databaseProductCategory = productCategoryRepository.findByName(productCategoryParam.getName());


        // If existing databaseProductCategory is null -- return productCategoryParam.
        // Otherwise -- return existing ProductCategory from database.
        if(Objects.isNull(databaseProductCategory)) {
            return productCategoryParam;
        } else {
            return databaseProductCategory;
        }
    }


}
