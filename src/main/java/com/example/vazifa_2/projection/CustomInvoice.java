package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Invoice;
import com.example.vazifa_2.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Invoice.class)

public interface CustomInvoice {

    Integer getId();
    Order getOrder();
    Double getAmount();
    Date getIssued();
    Date getDue();
    /*
    private
    @OneToOne
    private ;
    private Double amount;
    private Date issued;
    private Date due;
     */
}
