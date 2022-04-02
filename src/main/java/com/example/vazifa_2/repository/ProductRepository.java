package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.Product;
import com.example.vazifa_2.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",collectionResourceRel = "list", excerptProjection =
        CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
