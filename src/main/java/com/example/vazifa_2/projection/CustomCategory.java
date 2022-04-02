package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)

public interface CustomCategory {
    Integer getId();
    String getName();
    boolean isActive();
}
