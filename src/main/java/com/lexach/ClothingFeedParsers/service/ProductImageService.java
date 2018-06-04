package com.lexach.ClothingFeedParsers.service;

import com.lexach.ClothingFeedParsers.model.ProductImage;

public interface ProductImageService {

    /**
     * Gets image if it's presented in database.
     * Otherwise creates new instance of Image object.
     * @return New or existing image.
     * @param imageParam New image instance created outside of the database.
     */
    ProductImage getOrCreate(ProductImage imageParam);

    ProductImage save(ProductImage image);
}
