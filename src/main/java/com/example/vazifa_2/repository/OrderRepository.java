package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.Order;
import com.example.vazifa_2.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order",collectionResourceRel = "list", excerptProjection =
        CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
