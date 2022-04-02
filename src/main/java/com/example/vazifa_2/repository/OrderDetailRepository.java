package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.OrderDetail;
import com.example.vazifa_2.projection.CustomOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "orderDetail",collectionResourceRel = "list", excerptProjection =
        CustomOrderDetail.class)
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
