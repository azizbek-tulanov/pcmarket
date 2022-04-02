package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.Payment;
import com.example.vazifa_2.projection.CustomPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment",collectionResourceRel = "list", excerptProjection =
        CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
