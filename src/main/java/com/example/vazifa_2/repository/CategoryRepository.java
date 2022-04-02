package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.Category;
import com.example.vazifa_2.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",collectionResourceRel = "list", excerptProjection =
        CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
