package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.Invoice;
import com.example.vazifa_2.projection.CustomInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "invoice",collectionResourceRel = "list", excerptProjection =
        CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
