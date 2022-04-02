package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Invoice;
import com.example.vazifa_2.entity.Payment;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Payment.class)
public interface CustomPayment {


    Integer getId();
    Double getAmount();
    Timestamp getTimestamp();
    Invoice getInvoice();

}
