package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Attachment;
import com.example.vazifa_2.entity.Category;
import com.example.vazifa_2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)

public interface CustomProduct {
    Integer getId();
     String getName();

     Category getCategory();
      String getDescription();
     Attachment getPhoto();
}
